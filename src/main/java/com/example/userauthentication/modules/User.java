package com.example.userauthentication.modules;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class User extends BaseModel{
    private String username;
    private String password;
    private String fullname;
}
