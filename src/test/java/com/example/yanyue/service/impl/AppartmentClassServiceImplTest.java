package com.example.yanyue.service.impl;

import com.example.yanyue.dao.ApartmentClassDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentClassServiceImplTest {

    @Autowired
    private ApartmentClassDao apartmentClassDao;
    @Test
    public void getAll() {
        System.out.println(apartmentClassDao.getAll(null));
    }
}