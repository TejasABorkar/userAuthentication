package com.example.userauthentication.controller;

import com.example.userauthentication.dto.UserRequestDto;
import com.example.userauthentication.dto.UserResponseDto;
import com.example.userauthentication.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class AuthController {

    @Autowired
    private AuthService authService;

    //1) get user

    @GetMapping
    public UserResponseDto getUser(@RequestBody UserRequestDto user) {
        UserResponseDto userResponseDto = new UserResponseDto();

        return userResponseDto(authService.getUserByEmailId(emailId));
    }

}
