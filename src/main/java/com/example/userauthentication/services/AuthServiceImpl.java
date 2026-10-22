package com.example.userauthentication.services;

import com.example.userauthentication.dto.UserResponseDto;
import com.example.userauthentication.modules.Session;
import com.example.userauthentication.modules.User;
import com.example.userauthentication.repository.SessionRepository;
import com.example.userauthentication.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final SessionRepository sessionRepository;

    // Constructor injection: Spring fills these automatically
    public AuthServiceImpl(UserRepository userRepository,
                           SessionRepository sessionRepository) {
        this.userRepository = userRepository;
        this.sessionRepository = sessionRepository;
    }

    @Override
    public UserResponseDto login(String emailId, String password) {

        // 1) find user by emailId
        User user = userRepository.findByEmailId(emailId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.UNAUTHORIZED, "Invalid email or password"));

        // 2) check password (plain text for now; use BCrypt later)
        if (!user.getPassword().equals(password)) {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "Invalid email or password");
        }

        // 3) create a new session with a random 20 char token
        Session session = new Session();
        session.setUser(user);
        session.setToken(generateToken());
        sessionRepository.save(session);

        // 4) build the response (no password inside)
        UserResponseDto response = new UserResponseDto();
        response.setUserId(user.getId());
        response.setToken(session.getToken());
        return response;
    }
    //5) generate token id / session id
    private String generateToken() {

        return UUID.randomUUID().toString().replace("-", "").substring(0, 20);
    }

    @Override
    public boolean validate(String token) {
        return sessionRepository.findByToken(token).isPresent();
    }
}
