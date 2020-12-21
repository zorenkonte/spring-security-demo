package com.dark.mode.springsecuritydemo.service;

import com.dark.mode.springsecuritydemo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Iterable<Customer> customers();

    Page<Customer> paginateCustomers(Pageable pageable);
}
