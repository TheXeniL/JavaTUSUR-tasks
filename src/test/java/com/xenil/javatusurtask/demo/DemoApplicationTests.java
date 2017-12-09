package com.xenil.javatusurtask.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    SumService sumService;

    @Test
    public void testSum() {
        SumService service = new SumService();
        assertEquals(4,service.sum(2,2));
//        assertEquals(5,service.sum(2,2));
        assertTrue(0 == service.sum(-10,10));

        Integer a = 150;
        Integer b = 150;
        a = b;
        assertTrue(a.equals(b));
    }
}
