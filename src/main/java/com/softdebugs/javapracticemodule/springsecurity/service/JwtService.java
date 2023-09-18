package com.softdebugs.javapracticemodule.springsecurity.service;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class JwtService {

    private final UserDetailsServiceImpl userService;

    public final static String SECRET_KEY = "W1DqHrqxbzR09DbrqOsns771dwF8RAuT2xE8IWfdII8jOPHYAFiXY57wUxWzwdhywAaXnMtDeiv73cTlGR5zBMxqfFrVl0PFc/CvaTkouo60cS40siFwiW4PSdwuTGQbGiu/136w4jNZ4z6iWvE1qW+WL5WbAzT1Tpu68jrKObNnrHS5cmYMU1Jnzt22TnykCjqRPHZGfe3jzdLO1xyIdUSdB+Rt34KOkGgfgxX47yAVXLSdSVVmNUAWnAlwnMiGIjboCw7KXX21ZQ9PACjMI1ult5aBbhk0CQ6+tGZLiyQffRjM99zxyIauSXiRABr02bX7/3dtVnAPO7MlVj+BwDhZ3Kf9qE5xXcFVPZZgLhs=";

    public Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSigningKey() {
        byte[] secretKey = SECRET_KEY.getBytes();
        return Keys.hmacShaKeyFor(secretKey);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
        Claims claims = extractAllClaims(token);
        return claimResolver.apply(claims);
    }

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date(System.currentTimeMillis()));
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        String username = extractUsername(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    public String generateToken(UserDetails userDetails) {
        return generateToken(new HashMap<>(), userDetails);
    }

    public String generateToken(Map<String, Object> claims, UserDetails userDetails) {
        return Jwts
                .builder()
                .setClaims(claims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 2))
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

}
