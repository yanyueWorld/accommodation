package com.example.yanyue.dao;

import com.example.yanyue.pojo.ApartmentClass;

import java.util.List;

public interface ApartmentClassDao {
    int deleteByPrimaryKey(Integer classId);

    int insert(ApartmentClass record);

    int insertSelective(ApartmentClass record);

    ApartmentClass selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(ApartmentClass record);

    int updateByPrimaryKey(ApartmentClass record);

    List<ApartmentClass> getAll(ApartmentClass apartmentClass);

    ApartmentClass getClassByClassId(Integer classId);
}