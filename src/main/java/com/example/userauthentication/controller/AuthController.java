package com.example.userauthentication.controller;

import com.example.userauthentication.dto.LoginRequestDto;
import com.example.userauthentication.dto.UserResponseDto;
import com.example.userauthentication.dto.ValidateRequestDto;
import com.example.userauthentication.services.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")

    public UserResponseDto login(@RequestBody LoginRequestDto request) {
        return authService.login(request.getEmailId(), request.getPassword());
    }

    @PostMapping("/validate")

    public boolean validate(@RequestBody ValidateRequestDto request) {
        return authService.validate(request.getToken());
    }
}
