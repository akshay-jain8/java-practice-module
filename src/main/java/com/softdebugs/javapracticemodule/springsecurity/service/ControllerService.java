package com.softdebugs.javapracticemodule.springsecurity.service;

import com.softdebugs.javapracticemodule.springsecurity.model.Roles;
import com.softdebugs.javapracticemodule.springsecurity.model.User;
import com.softdebugs.javapracticemodule.springsecurity.repo.UserRepository;
import com.softdebugs.javapracticemodule.springsecurity.request.AuthenticateRequest;
import com.softdebugs.javapracticemodule.springsecurity.request.RegisterRequest;
import com.softdebugs.javapracticemodule.springsecurity.response.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ControllerService {

    private final UserRepository repository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;

    public String register(RegisterRequest request) {
        if (repository.findByEmail(request.getEmail()).isPresent()) {
            return "User already registered";
        }
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .pass(passwordEncoder.encode(request.getPass()))
                .role(Roles.GUEST)
                .build();
        repository.save(user);
        return "User is registered successfully";
    }

    public AuthenticationResponse authenticate(AuthenticateRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails userDetails = repository.findByEmail(request.getUsername()).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        String token = jwtService.generateToken(userDetails);
        return AuthenticationResponse.builder()
                .token(token)
                .build();
    }
}
