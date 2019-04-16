package com.example.yanyue.dao;

import com.example.yanyue.pojo.Picture;

import java.util.List;

public interface PictureDao {
    int deleteByPrimaryKey(Integer picId);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer picId);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);

    List<Picture> getAll(Picture picture);
}