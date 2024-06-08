package com.example.personalfinancemanagementapp.repository;

import com.example.personalfinancemanagementapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
