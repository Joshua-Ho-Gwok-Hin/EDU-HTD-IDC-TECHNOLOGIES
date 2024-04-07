package com.idc.customerproduct.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerModule add(CustomerModule customerModule) {
        System.out.println("customer::add called");
        return customerRepository.save(customerModule);
    }

//    public CustomerModule findByName(String name) {
//        return customerRepository.findByName(name);
//    }

    public List<CustomerModule> findAll() {
        return customerRepository.findAll();
    }
}
