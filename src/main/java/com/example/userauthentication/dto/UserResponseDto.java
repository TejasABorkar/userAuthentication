package com.example.userauthentication.dto;

import com.example.userauthentication.modules.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserResponseDto {
    private User user;
    private Long userId;
    private String token;
}
