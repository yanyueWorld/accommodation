package com.example.yanyue.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApartmentAttrDaoTest {

    @Autowired
    private ApartmentAttrDao apartmentAttrDao;
    @Test
    public void getAttrByAttrId() {
        System.out.println(apartmentAttrDao.getAttrByAttrId(1));
    }
}