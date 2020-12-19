package com.dark.mode.springsecuritydemo.service;

import com.dark.mode.springsecuritydemo.dao.UserDAO;
import com.dark.mode.springsecuritydemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public Optional<User> findByUsername(String name) {
        return userDAO.findByUsername(name);
    }
}
