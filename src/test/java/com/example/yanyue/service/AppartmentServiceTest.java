package com.example.yanyue.service;

import com.example.yanyue.pojo.Appartment;
import com.example.yanyue.pojo.vo.AppartmentVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Scanner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentServiceTest {

    @Autowired
    AppartmentService appartmentService;

    @Test
    public void getAppartmentByExample(){
        System.out.println(appartmentService.getAppartmentByExample(1,1,null));
    }

    @Test
    public void deleteByPrimaryKey(){
        System.out.println(appartmentService.deleteByPrimaryKey(0));
        System.out.println(appartmentService.deleteByPrimaryKey(null));
        System.out.println(appartmentService.deleteByPrimaryKey(3));
    }

    @Test
    public void updateByPrimaryKeySelective(){
        AppartmentVO appartment=new AppartmentVO();
        System.out.println(appartmentService.updateByPrimaryKeySelective(appartment));
        appartment.setAppartmentId(0);
        System.out.println(appartmentService.updateByPrimaryKeySelective(appartment));
        appartment.setAppartmentId(1);
        appartment.setAppartmentName("蛋壳");
        System.out.println(appartmentService.updateByPrimaryKeySelective(appartment));
    }

    @Test
    public void insertSelective(){
        AppartmentVO appartment=null;
        System.out.println(appartmentService.insertSelective(appartment));
        appartment=new AppartmentVO();
        System.out.println(appartmentService.insertSelective(appartment));
        appartment.setAppartmentName("");
        System.out.println(appartmentService.insertSelective(appartment));
        appartment.setAppartmentName("你好");
        System.out.println(appartmentService.insertSelective(appartment));
    }

    @Test
    public void getInfoByAppartmentId(){
        System.out.println(appartmentService.getInfoByAppartmentId(null));
        System.out.println(appartmentService.getInfoByAppartmentId(1));
    }

}