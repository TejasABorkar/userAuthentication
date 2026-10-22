package com.example.userauthentication.repository;

import com.example.userauthentication.modules.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getReferenceByUsername(String username);
}
