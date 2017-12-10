package com.xenil.javatusurtask.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerRestController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/api/customers/")
    @ResponseBody
    List<Customer> home(){
        List<Customer> customers = new ArrayList<>();
        jdbcTemplate.query("SELECT id, first_name, last_name FROM customers",(rs,rowNum)->new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
        ).forEach(customer -> customers.add(customer));


        return customers ;
    }
}
