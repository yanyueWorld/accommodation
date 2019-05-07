package com.example.yanyue.service.impl;

import com.example.yanyue.dao.MessageDao;
import com.example.yanyue.pojo.Message;
import com.example.yanyue.pojo.common.Result;
import com.example.yanyue.pojo.vo.MessageVO;
import com.example.yanyue.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;
    @Override
    public List<MessageVO> getAll(Integer currentPage, Integer pageSize, MessageVO messageVO) {
        List<MessageVO> messageVOS=messageDao.getAll(currentPage,pageSize,messageVO);
        if(messageVOS==null||messageVOS.size()==0) {
            return new ArrayList<>();
        }
        return messageVOS;
    }

    @Override
    public int insert(Message message) {
        if(message==null||message.getAccountId()==null||message.getAccountId()==0){
            return -1;
        }else{
            return messageDao.insert(message);
        }
    }
}
