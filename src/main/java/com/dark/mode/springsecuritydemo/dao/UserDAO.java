package com.dark.mode.springsecuritydemo.dao;

import com.dark.mode.springsecuritydemo.model.User;
import com.dark.mode.springsecuritydemo.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDAO extends UserRepository {
    Optional<User> findByUsername(String name);
}
