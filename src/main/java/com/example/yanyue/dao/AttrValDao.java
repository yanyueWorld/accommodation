package com.example.yanyue.dao;

import com.example.yanyue.pojo.AttrVal;
import org.w3c.dom.Attr;

import java.util.List;

public interface AttrValDao {
    int deleteByPrimaryKey(Integer attrValueId);

    int insert(AttrVal record);

    int insertSelective(AttrVal record);

    AttrVal selectByPrimaryKey(Integer attrValueId);

    int updateByPrimaryKeySelective(AttrVal record);

    int updateByPrimaryKey(AttrVal record);

    List<AttrVal> getAll(AttrVal attrVal);
}