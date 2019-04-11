package com.example.yanyue.dao;


import com.example.yanyue.pojo.vo.AppartmentVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentDaoTest {

    @Autowired
    private AppartmentDao appartmentDao;


    @Test
    public void getAppartmentByExample(){
        AppartmentVO appartmentVO=new AppartmentVO();
        appartmentVO.setApartmentName("蛋");
        System.out.println(appartmentDao.getAppartmentByExample(1,1,appartmentVO));
    }

    @Test
    public void deleteByPrimaryKey(){
        System.out.println(appartmentDao.deleteByPrimaryKey(3));
    }
}