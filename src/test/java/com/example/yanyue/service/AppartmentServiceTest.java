package com.example.yanyue.service;

import com.example.yanyue.pojo.Appartment;
import com.example.yanyue.pojo.vo.AppartmentVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppartmentServiceTest {
    @Autowired
    private AppartmentService appartmentService;

    @Test
    public void getAll() {
        AppartmentVO appartmentVO=new AppartmentVO();
        List<Integer> typeIds=new ArrayList<>();
        List<Integer> attrIds=new ArrayList<>();
        appartmentVO.setAttrIds(attrIds);
        appartmentVO.setTypeIds(typeIds);
        System.out.println(appartmentService.getAll(1,5,appartmentVO));
    }


    @Test
    public void getTheMostInTheMonth(){
        System.out.println(appartmentService.getTheMostInLastMonth());
    }

    @Test
    public  void getTheMostInLastMonth(){
        System.out.println(appartmentService.getTheMostInLastMonth());
    }
}