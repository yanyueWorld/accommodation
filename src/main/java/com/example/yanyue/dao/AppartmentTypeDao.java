package com.example.yanyue.dao;

import com.example.yanyue.pojo.AppartmentType;

public interface AppartmentTypeDao {
    int deleteByPrimaryKey(Integer typeId);

    int insert(AppartmentType record);

    int insertSelective(AppartmentType record);

    AppartmentType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(AppartmentType record);

    int updateByPrimaryKey(AppartmentType record);
}