package com.example.yanyue.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * //TODO description end with .
 *
 * @author yanyue, 2019/5/27
 * @version Araf v1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApartmentClassDaoTest {
    @Autowired
    private ApartmentClassDao apartmentClassDao;
    @Test
    public void getClassByClassId() {
        System.out.println(apartmentClassDao.getClassByClassId(1));
    }
}