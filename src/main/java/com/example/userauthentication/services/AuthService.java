package com.example.userauthentication.services;

import com.example.userauthentication.dto.UserResponseDto;
import com.example.userauthentication.modules.User;

import java.util.Optional;

public interface AuthService {

    public Optional<User> getUserById(Long user_id);

    public User getUserByEmailId(String emailId);

    public String updateEmailId(Long user_id , String emailId);

    public String updatePassword(Long user_id , String newPassword);

}