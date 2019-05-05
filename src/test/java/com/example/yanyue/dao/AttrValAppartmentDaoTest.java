package com.example.yanyue.dao;

import com.example.yanyue.pojo.AttrValAppartment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AttrValAppartmentDaoTest {
    @Autowired
    private AttrValAppartmentDao attrValAppartmentDao;

    @Test
    public void insert(){
        AttrValAppartment attrValAppartment=new AttrValAppartment();
        attrValAppartment.setAppartmentId(47);
        attrValAppartment.setAttrValId(29);
        System.out.println(attrValAppartmentDao.add(attrValAppartment));
    }



}