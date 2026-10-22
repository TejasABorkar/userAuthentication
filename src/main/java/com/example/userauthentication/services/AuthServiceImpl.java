package com.example.userauthentication.services;

import com.example.userauthentication.modules.User;
import com.example.userauthentication.repository.SessionRepository;
import com.example.userauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {

    private UserRepository userRepository;

    private SessionRepository sessionRepository;

    @Override
    public Optional<User> getUserById(Long user_id){
        return Optional.of(new User());
    }

    @Override
    public User getUserByEmailId(String emailId){

        // 1) if user emailid is available then generate new session id
        // 2) save this session id with correct user id
        // 3) pass this session id to UserResponseDto

        Optional<String> id= userRepository.getReferenceByemailId(emailId);
        if ( id.isPresent()){

        }

        else {

        }
    }

    @Override
    public String updateEmailId(Long user_id , String newEmailId){
        return null;
    }

    @Override
    public String updatePassword(Long user_id , String newPassword){
        return null;
    }
}
