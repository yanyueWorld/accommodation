package com.example.yanyue.dao;

import com.example.yanyue.pojo.AttrVal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AttrValDaoTest {
    @Autowired
    private AttrValDao attrValDao;

    @Test
    public void getAll(){
        System.out.println(attrValDao.getAll(null));
        System.out.println(attrValDao.getAll(new AttrVal(null,null,"工",null)));
    }

    @Test
    public void insert(){
        System.out.println(attrValDao.insertSelective(new AttrVal(null,null,"田园风",null)));
    }

    @Test
    public void update(){
        System.out.println(attrValDao.updateByPrimaryKeySelective(new AttrVal(3,null,"田园",null)));
    }

    @Test
    public void delete(){
        System.out.println(attrValDao.deleteByPrimaryKey(3));
    }
}