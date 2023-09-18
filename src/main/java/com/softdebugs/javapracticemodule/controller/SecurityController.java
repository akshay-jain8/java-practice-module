package com.softdebugs.javapracticemodule.controller;

import com.softdebugs.javapracticemodule.springsecurity.request.AuthenticateRequest;
import com.softdebugs.javapracticemodule.springsecurity.request.RegisterRequest;
import com.softdebugs.javapracticemodule.springsecurity.response.AuthenticationResponse;
import com.softdebugs.javapracticemodule.springsecurity.service.ControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @Autowired
    private ControllerService service;

    @PostMapping("security/api/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(service.register(request));
    }

    @GetMapping("security/api/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticateRequest request) {
        return ResponseEntity.ok(service.authenticate(request));
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("You are now authorized. Welcome to Soft_Debugs");
    }
}
