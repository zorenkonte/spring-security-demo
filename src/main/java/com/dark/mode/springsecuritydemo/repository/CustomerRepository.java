package com.dark.mode.springsecuritydemo.repository;

import com.dark.mode.springsecuritydemo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}