package com.example.yanyue.dao;

import com.example.yanyue.pojo.Picture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PictureDaoTest {
    @Autowired
    private PictureDao pictureDao;

    @Test
    public void insert(){
        Picture picture=new Picture();
        picture.setPicName("aa");
        picture.setPicAddr("ss");
        System.out.println(pictureDao.insertSelective(picture));
    }

    @Test
    public void getAll(){
        Picture picture=new Picture();
        picture.setPicName("aa");
        picture.setPicAddr("ss");
        System.out.println(pictureDao.getAll(picture));
    }

    @Test
    public void getPicturesByAppartmentId(){
        System.out.println(pictureDao.getPicturesByAppartmentId(1));
    }
}