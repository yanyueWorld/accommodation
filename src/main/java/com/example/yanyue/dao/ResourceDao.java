package com.example.yanyue.dao;

import com.example.yanyue.pojo.Resource;

import java.util.List;

public interface ResourceDao {
    int deleteByPrimaryKey(Integer resourceId);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer resourceId);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);


}