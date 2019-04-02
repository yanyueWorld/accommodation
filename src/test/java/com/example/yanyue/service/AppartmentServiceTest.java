package com.example.yanyue.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentServiceTest {

    @Autowired
    AppartmentService appartmentService;

    @Test
    public void getAppartmentByExample(){
        System.out.println(appartmentService.getAppartmentByExample(1,1));
    }
}