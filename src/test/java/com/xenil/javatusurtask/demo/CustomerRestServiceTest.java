package com.xenil.javatusurtask.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CustomerRestServiceTest {

    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void testFindAll() throws Exception {
        ResponseEntity<List<Customer>> usersResponse = this.restTemplate.exchange(
                "http://localhost:8080/test/it", HttpMethod.GET, null, new ParameterizedTypeReference<List<Customer>>(){});
        System.out.println("yo");
    }

}
