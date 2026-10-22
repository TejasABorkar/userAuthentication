package com.example.userauthentication.services;

import com.example.userauthentication.dto.UserResponseDto;


public interface AuthService {

    UserResponseDto login(String emailId, String password);
}
