package pers.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer add(Customer customer) {
        System.out.println("customerService::add called.");
        return customerRepository.save(customer);
    }

//    public Customer findByName(String name) {
//        return customerRepository.findByName(name);
//    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
