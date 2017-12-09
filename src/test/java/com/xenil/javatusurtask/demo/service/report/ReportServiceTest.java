package com.xenil.javatusurtask.demo.service.report;

import com.xenil.javatusurtask.demo.SumService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportServiceTest {
    @Autowired
    ReportService reportService;

    @MockBean
    SumService sumService;



    @Before
    public void setup(){
        Mockito.when(sumService.sum(2,2)).thenReturn(4);
    }

    @Test
    public void sumReport() throws Exception {
        assertEquals("4",2,2);
    }


}