package com.example.yanyue.pojo;

import com.example.yanyue.dao.MessageDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageTest {
    @Autowired
    private MessageDao messageDao;

    @Test
    public void getAll(){
        System.out.println(messageDao.getAll(null));
        Message message=new Message();
        message.setMessage("风格");
        System.out.println(messageDao.getAll(message));
    }

    @Test
    public void insert(){
        Message message=new Message();
        message.setMessage("ehee");
        System.out.println(messageDao.insert(message));
    }

    @Test
    public void update(){
        Message message=new Message();
        message.setMessageId(2);
        message.setType("整体评价");
        System.out.println(messageDao.updateByPrimaryKeySelective(message));
    }

    @Test
    public void delete(){
        System.out.println(messageDao.deleteByPrimaryKey(2));
    }

}