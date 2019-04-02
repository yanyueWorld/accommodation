package com.example.yanyue.dao;

import com.example.yanyue.pojo.Picture;

public interface PictureDao {
    int deleteByPrimaryKey(Integer picId);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer picId);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}