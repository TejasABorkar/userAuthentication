package com.example.userauthentication.repository;

import com.example.userauthentication.modules.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    // will be used later for the validate API
    Optional<Session> findByToken(String token);
}
