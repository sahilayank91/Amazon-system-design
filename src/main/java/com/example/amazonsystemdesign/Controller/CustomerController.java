package com.example.amazonsystemdesign.Controller;

import com.example.amazonsystemdesign.Model.Customer;
import com.example.amazonsystemdesign.Repository.CustomerRepository;
import com.example.amazonsystemdesign.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

    @PostMapping(value="/addCustomer")
    private Boolean addCustomer(Customer customer){
        customerServices.addCustomer(customer);
        return true;
    }

    @PostMapping(value="/updateCustomer")
    private Boolean updateCustomer(Customer customer){
        customerServices.addCustomer(customer);
        return true;
    }
}
