package com.example.userauthentication.controller;

import com.example.userauthentication.dto.UserResponseDto;
import com.example.userauthentication.modules.User;
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

    //1) Check where user credentials is correct or not
    //2)if user

    @GetMapping
    public UserResponseDto getUser(@RequestBody User user) {
        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.setUserId();
        userResponseDto.setToken();

        return userResponseDto(authService.getUserByUserName(user.));
    }

}
