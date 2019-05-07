package com.example.yanyue.service;

import com.example.yanyue.pojo.Message;
import com.example.yanyue.pojo.vo.MessageVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceTest {
    @Autowired
    private MessageService messageService;
    @Test
    public void getAll(){
        System.out.println(messageService.getAll(5,1,null));
        System.out.println(messageService.getAll(5,1,new MessageVO()));
    }
    @Test
    public void insert(){
        Message message=new Message();
        message.setAccountId(1);
        message.setCustomerRank("5");
        System.out.println(messageService.insert(message));
    }
}