package com.xenil.javatusurtask.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    @Autowired
    final RuntimeService runtimeService;

    @Autowired
    final TaskService taskService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("api/customers/{customerId}")
    @ResponseBody
    List<Customer> customerByName(@PathVariable("customerId") int customerId){

        List<Customer> foundCustomer = new ArrayList<>();

        jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers WHERE id = ?", new Object[] { customerId },
                (rs, rowNum) -> new Customer(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
        ).forEach(customer -> foundCustomer.add(customer));

        return foundCustomer;
    }

    @RequestMapping(value = "/process")
        @ResponseBody
        public String startProcess() {
            Map<String, Object> variables = new HashMap<String, Object>();
            variables.put("applicantName", "John Doe");
            variables.put("email", "john.doe@activiti.com");
            variables.put("phoneNumber", "123456789");
            runtimeService.startProcessInstanceByKey("hireProcess", variables);
            return "hello";
    }
}
