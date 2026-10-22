package com.example.userauthentication.services;

import com.example.userauthentication.dto.UserResponseDto;
import com.example.userauthentication.modules.User;

import java.util.Optional;

public interface AuthService {

    public Optional<User> getUserById(Long user_id);

    public User getUserByUserName(String UserName);

    public User createUser(String username, String password);

    public String updateUserName(Long user_id , String newName);

    public String updatePassword(Long user_id , String newPassword);

}