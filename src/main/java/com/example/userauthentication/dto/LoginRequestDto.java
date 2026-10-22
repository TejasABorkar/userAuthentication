package com.example.userauthentication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LoginRequestDto {

    private Long emailId;
    private String password;
}
