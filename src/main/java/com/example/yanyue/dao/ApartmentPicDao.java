package com.example.yanyue.dao;

import com.example.yanyue.pojo.ApartmentPic;

import java.util.List;

public interface ApartmentPicDao {
    int deleteByPrimaryKey(Integer apicId);

    int insert(ApartmentPic record);

    int insertSelective(ApartmentPic record);

    ApartmentPic selectByPrimaryKey(Integer apicId);

    int updateByPrimaryKeySelective(ApartmentPic record);

    int updateByPrimaryKey(ApartmentPic record);

    List<ApartmentPic> getAll(ApartmentPic apartmentPic);
}