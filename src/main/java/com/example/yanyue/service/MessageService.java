package com.example.yanyue.service;

import com.example.yanyue.pojo.Message;
import com.example.yanyue.pojo.vo.MessageVO;

import java.util.List;

public interface MessageService {
    List<MessageVO> getAll(Integer currentPage,Integer pageSize,MessageVO messageVO);
    int insert(Message message);
}
