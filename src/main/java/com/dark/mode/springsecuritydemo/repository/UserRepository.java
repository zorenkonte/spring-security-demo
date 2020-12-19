package com.dark.mode.springsecuritydemo.repository;

import com.dark.mode.springsecuritydemo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}