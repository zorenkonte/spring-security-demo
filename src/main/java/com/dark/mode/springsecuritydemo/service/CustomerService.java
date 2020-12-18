package com.dark.mode.springsecuritydemo.service;

import com.dark.mode.springsecuritydemo.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Iterable<Customer> customers();
}
