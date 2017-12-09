package com.xenil.javatusurtask.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/customers/{customerName}")
    @ResponseBody
    List<String> customerByName(@PathVariable("customerName") String customerName){

        List<String> customers = new ArrayList<>();

        for (Customer customer : customerRepository.findByLastName(customerName)) {
        customers.add(customerName);
        }

        return customers;
    }
}
