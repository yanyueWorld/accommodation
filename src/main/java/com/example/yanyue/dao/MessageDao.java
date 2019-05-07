package com.example.yanyue.dao;

import com.example.yanyue.pojo.Message;
import com.example.yanyue.pojo.vo.MessageVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageDao {
    int deleteByPrimaryKey(Integer messageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<MessageVO> getAll(@Param("page") Integer currentPage,
                           @Param("limit") Integer pageSize, @Param("messageVO") MessageVO messageVO);
}