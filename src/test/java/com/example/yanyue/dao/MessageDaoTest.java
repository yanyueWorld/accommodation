package com.example.yanyue.dao;

import com.example.yanyue.pojo.Message;
import com.example.yanyue.pojo.vo.MessageVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageDaoTest {
    @Autowired
    private MessageDao messageDao;

    @Test
    public void getAll(){
        System.out.println(messageDao.getAll(5,1,null));
        System.out.println(messageDao.getAll(5,1,new MessageVO()));
        MessageVO messageVO=new MessageVO();
        messageVO.setAccountName("a");
        System.out.println(messageDao.getAll(5,1,messageVO));
    }

    @Test
    public void insert(){
        Message message=new Message();
        message.setLivingRank("5");
        message.setServiceRank("5");
        message.setMessage("轰趴聚会首选之地");
        System.out.println(messageDao.insertSelective(message));
    }

}