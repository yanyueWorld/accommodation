package com.example.yanyue.dao;

import com.example.yanyue.pojo.Appartment;
import com.example.yanyue.pojo.AppartmentType;

import java.util.List;

public interface AppartmentTypeDao {
    int deleteByPrimaryKey(Integer typeId);

    int insert(AppartmentType record);

    int insertSelective(AppartmentType record);

    AppartmentType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(AppartmentType record);

    int updateByPrimaryKey(AppartmentType record);

    List<AppartmentType> getAll(AppartmentType appartmentType);
}