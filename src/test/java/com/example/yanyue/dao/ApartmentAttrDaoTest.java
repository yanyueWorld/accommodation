package com.example.yanyue.dao;

import com.example.yanyue.pojo.ApartmentAttr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApartmentAttrDaoTest {
    @Autowired
    ApartmentAttrDao apartmentAttrDao;

    @Test
    public void getAll() {
        System.out.println(apartmentAttrDao.getAll(null));
        System.out.println(apartmentAttrDao.getAll(new ApartmentAttr(null,"修",null)));
    }

    @Test
    public void insert(){
        System.out.println(apartmentAttrDao.insertSelective(new ApartmentAttr(null,"shs",3)));
    }

    @Test
    public void update(){
        System.out.println(apartmentAttrDao.updateByPrimaryKeySelective(new ApartmentAttr(3,"aaaa",1)));
    }

    @Test
    public void delete(){
        System.out.println(apartmentAttrDao.deleteByPrimaryKey(3));
    }
}