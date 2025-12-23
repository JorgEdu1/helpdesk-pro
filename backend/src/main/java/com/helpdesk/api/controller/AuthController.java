package com.helpdesk.api.controller;

import com.helpdesk.api.dto.RegisterRequest;
import com.helpdesk.api.model.User;
import com.helpdesk.api.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public String login() {
        return "Login Endpoint Liberado!";
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody @Valid RegisterRequest request) {
        var newUser = authService.register(request);
        return ResponseEntity.ok(newUser);
    }
}