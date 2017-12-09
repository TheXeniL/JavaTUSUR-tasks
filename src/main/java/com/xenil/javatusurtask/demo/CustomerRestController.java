package com.xenil.javatusurtask.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/api/customers/")
    @ResponseBody
    List<Customer> home(){
        return customerRepository.findAll();
    }
}
