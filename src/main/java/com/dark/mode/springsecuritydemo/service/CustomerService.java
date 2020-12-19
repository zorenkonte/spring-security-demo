package com.dark.mode.springsecuritydemo.service;

import com.dark.mode.springsecuritydemo.model.Customer;

public interface CustomerService {
    Iterable<Customer> customers();
}
