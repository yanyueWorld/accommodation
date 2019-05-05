package com.example.yanyue.service.impl;

import com.example.yanyue.dao.AppartmentTypeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentTypeServiceImplTest {

    @Autowired
    private AppartmentTypeDao appartmentTypeDao;

    @Test
    public void getAll(){
        System.out.println( appartmentTypeDao.getAll(null));
    }

}