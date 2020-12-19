package com.dark.mode.springsecuritydemo.service;

import com.dark.mode.springsecuritydemo.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByUsername(String name);
}
