package com.dark.mode.springsecuritydemo.service;

import com.dark.mode.springsecuritydemo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> customers();

    Optional<Customer> customer(Integer id);

    Customer save(Customer customer);

    void deleteById(Integer id);

    Page<Customer> paginateCustomers(Pageable pageable);
}
