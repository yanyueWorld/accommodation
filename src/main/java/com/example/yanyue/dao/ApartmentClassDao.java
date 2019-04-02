package com.example.yanyue.dao;

import com.example.yanyue.pojo.ApartmentClass;

public interface ApartmentClassDao {
    int deleteByPrimaryKey(Integer classId);

    int insert(ApartmentClass record);

    int insertSelective(ApartmentClass record);

    ApartmentClass selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(ApartmentClass record);

    int updateByPrimaryKey(ApartmentClass record);
}