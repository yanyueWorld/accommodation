package com.example.yanyue.dao;


import com.example.yanyue.pojo.InformationCheckIn;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InformationCheckInDaoTest {
    @Autowired
    private InformationCheckInDao informationCheckInDao;

    @Test
    public void getAll(){
        System.out.println(informationCheckInDao.getAll(null));
        InformationCheckIn informationCheckIn=new InformationCheckIn();
        informationCheckIn.setNumberOfPeople(2);
        BigDecimal bigDecimal=new BigDecimal(800);
        informationCheckIn.setPrePay(bigDecimal);
        System.out.println(informationCheckInDao.getAll(informationCheckIn));
    }

    @Test
    public void insert(){
        InformationCheckIn informationCheckIn=new InformationCheckIn();
        informationCheckIn.setAppartmentId(2);
        System.out.println(informationCheckInDao.insertSelective(informationCheckIn));
    }

    @Test
    public void update(){
        InformationCheckIn informationCheckIn =new InformationCheckIn();
        informationCheckIn.setInforId(2);
        informationCheckIn.setAccountId(4);
        System.out.println(informationCheckInDao.updateByPrimaryKeySelective(informationCheckIn));
    }

    @Test
    public void delete(){
        System.out.println(informationCheckInDao.deleteByPrimaryKey(2));
    }
}