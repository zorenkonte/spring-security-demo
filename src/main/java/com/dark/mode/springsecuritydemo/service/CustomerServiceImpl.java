package com.dark.mode.springsecuritydemo.service;

import com.dark.mode.springsecuritydemo.dao.CustomerDAO;
import com.dark.mode.springsecuritydemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDAO customerDAO;

    @Autowired
    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public Iterable<Customer> customers() {
        return customerDAO.findAll();
    }
}
