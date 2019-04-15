package com.example.yanyue.dao;

import com.example.yanyue.pojo.ApartmentClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApartmentClassDaoTest {
    @Autowired
    private ApartmentClassDao apartmentClassDao;

    @Test
    public void getAll(){
        System.out.println(apartmentClassDao.getAll(null));
        System.out.println(apartmentClassDao.getAll(new ApartmentClass(null,"公")));
    }
    @Test
    public void insert(){
        System.out.println(apartmentClassDao.insertSelective(new ApartmentClass(null,"别墅")));
    }
    @Test
    public void update(){
        System.out.println(
                apartmentClassDao.updateByPrimaryKey(new ApartmentClass(1,"别墅啊"))
        );
    }
    @Test
    public void delete(){
        apartmentClassDao.deleteByPrimaryKey(2);
    }
}