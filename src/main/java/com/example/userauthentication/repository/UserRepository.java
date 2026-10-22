package com.example.userauthentication.repository;

import com.example.userauthentication.modules.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getReferenceByemailId(String username);
}
