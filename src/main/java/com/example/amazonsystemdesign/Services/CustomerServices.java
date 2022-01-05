package com.example.amazonsystemdesign.Services;

import com.example.amazonsystemdesign.Model.Customer;
import com.example.amazonsystemdesign.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;

    public Boolean addCustomer(Customer customer){
        customerRepository.save(customer);
        return true;
    }

    public Boolean updateCustomer(Customer customer){
        Optional<Customer> customer1 = customerRepository.findById(customer.getCustomerID());
        if(customer1.isPresent()){

        }
        return true;
    }
}
