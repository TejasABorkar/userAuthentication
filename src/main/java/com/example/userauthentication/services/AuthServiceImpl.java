package com.example.userauthentication.services;

import com.example.userauthentication.modules.User;
import com.example.userauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    //1) Check where user credentials is correct or not
    //2) if user is valid Creates a random 20-character string




    @Override
    public Optional<User> getUserById(Long user_id){
        return Optional.of(new User());
    }

    @Override
    public User getUserByUserName(String UserName){
        return null;
    }

    @Override
    public User createUser(String username, String password){
        return null;
    }

    @Override
    public String updateUserName(Long user_id , String newName){
        return null;
    }

    @Override
    public String updatePassword(Long user_id , String newPassword){
        return null;
    }

}
