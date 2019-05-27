package com.example.yanyue.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentDaoTest {
    @Autowired
    private AppartmentDao appartmentDao;

    @Test
    public void getAll(){
        System.out.println(appartmentDao.getAll());
    }

}