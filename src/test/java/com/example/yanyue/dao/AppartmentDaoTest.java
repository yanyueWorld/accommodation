package com.example.yanyue.dao;


import com.example.yanyue.pojo.Appartment;
import com.example.yanyue.pojo.vo.AppartmentVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentDaoTest {

    @Autowired
    private AppartmentDao appartmentDao;


    @Test
    public void getAppartmentByExample(){
        AppartmentVO appartmentVO=new AppartmentVO();
       // appartmentVO.setEndPrice(new BigDecimal(289));
        System.out.println(appartmentDao.getAppartmentByExample(1,5,appartmentVO));
    }

    @Test
    public void getInfoByAppartmentId(){
        System.out.println(appartmentDao.getInfoByAppartmentId(1));
    }

    @Test
    public void deleteByPrimaryKey(){
        System.out.println(appartmentDao.deleteByPrimaryKey(3));
    }

    @Test
    public void updateByPrimaryKeySelective(){
        AppartmentVO appartment=new AppartmentVO();
        appartment.setAppartmentId(1);
        appartment.setAppartmentName("躯壳 ");
        System.out.println(appartmentDao.updateByPrimaryKeySelective(appartment));
    }

    @Test
    public void insertSelective(){
        Appartment appartment=new Appartment();
        appartment.setApartmentName("你好");
        System.out.println(appartmentDao.insertSelective(appartment));
    }
}