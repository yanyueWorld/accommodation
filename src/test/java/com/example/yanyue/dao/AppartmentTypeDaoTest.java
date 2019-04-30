package com.example.yanyue.dao;

import com.example.yanyue.pojo.Appartment;
import com.example.yanyue.pojo.AppartmentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentTypeDaoTest {
    @Autowired
    AppartmentTypeDao appartmentTypeDao;

    @Test
    public void getAll(){
        System.out.println(appartmentTypeDao.getAll(null));
        System.out.println(appartmentTypeDao.getAll(new AppartmentType(null,"小")));

    }

    @Test
    public void insert(){
        System.out.println(appartmentTypeDao.insert(new AppartmentType(null,"aaa")));
    }

    @Test
    public void delete(){
        System.out.println(appartmentTypeDao.deleteByPrimaryKey(2));
    }

    @Test
    public void update(){
        System.out.println(appartmentTypeDao.updateByPrimaryKeySelective(new AppartmentType(1,"小户型")));
    }
}