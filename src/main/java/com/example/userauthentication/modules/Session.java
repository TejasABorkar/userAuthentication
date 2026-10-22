package com.example.userauthentication.modules;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Timer;

@Getter
@Setter


@Entity
public class Session extends BaseModel {

    @ManyToOne
    private User user;

    @Column(unique = true, nullable = false)
    private String token;
}