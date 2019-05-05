package com.example.yanyue.dao;

import com.example.yanyue.pojo.AttrValAppartment;

public interface AttrValAppartmentDao {
    int deleteByPrimaryKey(Integer attrValAppartmentId);

    int insert(AttrValAppartment record);

    int insertSelective(AttrValAppartment record);

    AttrValAppartment selectByPrimaryKey(Integer attrValAppartmentId);

    int updateByPrimaryKeySelective(AttrValAppartment record);

    int updateByPrimaryKey(AttrValAppartment record);

    int add(AttrValAppartment attrValAppartment);
}