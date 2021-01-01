package com.dark.mode.springsecuritydemo.service;

import com.dark.mode.springsecuritydemo.dao.CustomerDAO;
import com.dark.mode.springsecuritydemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Optional<Customer> customer(Integer id) {
        return customerDAO.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public void deleteById(Integer id) {
        customerDAO.deleteById(id);
    }

    @Override
    public Page<Customer> paginateCustomers(Pageable pageable) {
        return customerDAO.findAll(pageable);
    }
}
