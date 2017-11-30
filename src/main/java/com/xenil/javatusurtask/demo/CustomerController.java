package com.xenil.javatusurtask.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/customers/{customerName}")
    @ResponseBody
    String home(@PathVariable("customerName") String customerName){
        for (Customer customer : customerRepository.findAll()) {

        }
        return "Hello world" ;
    }
}
