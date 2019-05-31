package com.example.yanyue.dao;

import com.example.yanyue.pojo.vo.AppartmentVO;
import com.google.gson.Gson;
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
    public void getAll(){
        AppartmentVO appartmentVO=new AppartmentVO();
        appartmentVO.setTypeId(1);
        Gson gson=new Gson();
        System.out.println(gson.toJson(appartmentVO));
        System.out.println(appartmentDao.getAll(1,5,appartmentVO
        ).size());
    }

    @Test
    public void getInfo(){
        System.out.println(appartmentDao.getInfo(1));
    }

}