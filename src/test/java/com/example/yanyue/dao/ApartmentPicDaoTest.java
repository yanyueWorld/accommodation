package com.example.yanyue.dao;

import com.example.yanyue.pojo.ApartmentPic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApartmentPicDaoTest {
    @Autowired
    ApartmentPicDao apartmentPicDao;

    @Test
    public void getAll(){
        System.out.println(apartmentPicDao.getAll(null));
        System.out.println(apartmentPicDao.getAll(new ApartmentPic(null,1,null)));
    }
    @Test
    public void insert(){
        System.out.println(apartmentPicDao.insert(new ApartmentPic(null,1,1)));
    }
    @Test
    public void delete(){
        System.out.println(apartmentPicDao.deleteByPrimaryKey(8));
    }
    @Test
    public void update(){
        System.out.println(apartmentPicDao.updateByPrimaryKeySelective(new ApartmentPic(8,3,1)));
    }
}