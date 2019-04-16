package com.example.yanyue.dao;

import com.example.yanyue.pojo.Picture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PictureDaoTest {
    @Autowired
    private PictureDao pictureDao;

    @Test
    public void insert(){
        Picture picture=new Picture();
        picture.setPicName("danke");
        System.out.println(pictureDao.insertSelective(picture));
    }

    @Test
    public void update(){
        Picture picture=new Picture();
        picture.setPicId(8);
        picture.setPicAddr("sss");
        System.out.println(pictureDao.updateByPrimaryKeySelective(picture));
    }

    @Test
    public void getAll(){
        System.out.println(pictureDao.getAll(null));
        Picture picture=new Picture();
        picture.setPicName("da");
        System.out.println(pictureDao.getAll(picture));
    }

    @Test
    public void delete(){
        System.out.println(pictureDao.deleteByPrimaryKey(8));
    }
}