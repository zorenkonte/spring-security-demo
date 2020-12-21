package com.dark.mode.springsecuritydemo.repository;

import com.dark.mode.springsecuritydemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}