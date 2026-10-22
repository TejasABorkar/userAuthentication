package com.example.userauthentication.modules;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class User extends BaseModel {

    @Column(unique = true, nullable = false)
    private String emailId;

    private String password;

    private String fullName;
}
