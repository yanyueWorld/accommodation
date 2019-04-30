package com.example.yanyue.dao;

import com.example.yanyue.pojo.Value;

public interface ValueDao {
    int deleteByPrimaryKey(Integer valueId);

    int insert(Value record);

    int insertSelective(Value record);

    Value selectByPrimaryKey(Integer valueId);

    int updateByPrimaryKeySelective(Value record);

    int updateByPrimaryKey(Value record);
}