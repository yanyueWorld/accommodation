package com.example.yanyue.dao;

import com.example.yanyue.pojo.ApartmentAttr;

import java.util.List;


public interface ApartmentAttrDao {
    int deleteByPrimaryKey(Integer attrId);

    int insert(ApartmentAttr record);

    int insertSelective(ApartmentAttr record);

    ApartmentAttr selectByPrimaryKey(Integer attrId);

    int updateByPrimaryKeySelective(ApartmentAttr record);

    int updateByPrimaryKey(ApartmentAttr record);

    List<ApartmentAttr> getAll(ApartmentAttr apartmentAttr);


}