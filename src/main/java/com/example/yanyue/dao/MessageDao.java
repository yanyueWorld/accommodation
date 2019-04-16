package com.example.yanyue.dao;

import com.example.yanyue.pojo.Message;

import java.util.List;

public interface MessageDao {
    int deleteByPrimaryKey(Integer messageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<Message> getAll(Message message);
}