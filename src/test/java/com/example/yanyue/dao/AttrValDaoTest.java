package com.example.yanyue.dao;

import com.example.yanyue.pojo.AttrVal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AttrValDaoTest {
    @Autowired
    private AttrValDao attrValDao;

    @Test
    public void select(){
        AttrVal attrVal=new AttrVal();
        attrVal.setValId(1);
        attrVal.setAttrId(1);
        System.out.println(attrValDao.getAttrValId(attrVal));
    }

}