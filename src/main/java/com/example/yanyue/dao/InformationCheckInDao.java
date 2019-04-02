package com.example.yanyue.dao;

import com.example.yanyue.pojo.InformationCheckIn;

public interface InformationCheckInDao {
    int deleteByPrimaryKey(Integer inforId);

    int insert(InformationCheckIn record);

    int insertSelective(InformationCheckIn record);

    InformationCheckIn selectByPrimaryKey(Integer inforId);

    int updateByPrimaryKeySelective(InformationCheckIn record);

    int updateByPrimaryKey(InformationCheckIn record);
}