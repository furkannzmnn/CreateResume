package com.example.resume.DataAcces;

import com.example.resume.Core.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserDao extends JpaRepository<User , String> {
    Optional<User> findByEmail(String email);
}
