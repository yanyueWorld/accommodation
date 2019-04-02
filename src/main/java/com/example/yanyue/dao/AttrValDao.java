package com.example.yanyue.dao;

import com.example.yanyue.pojo.AttrVal;

public interface AttrValDao {
    int deleteByPrimaryKey(Integer attrValueId);

    int insert(AttrVal record);

    int insertSelective(AttrVal record);

    AttrVal selectByPrimaryKey(Integer attrValueId);

    int updateByPrimaryKeySelective(AttrVal record);

    int updateByPrimaryKey(AttrVal record);
}