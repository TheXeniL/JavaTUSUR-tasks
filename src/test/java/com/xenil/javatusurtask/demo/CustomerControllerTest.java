package com.xenil.javatusurtask.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerControllerTest {

    @Autowired
    CustomerController customerController;

    @Test
    public void testController(){
        assertNull(customerController.customerByName("Bauer"));
        assertNotNull(customerController.customerByName("Elizarov"));
    }

}
