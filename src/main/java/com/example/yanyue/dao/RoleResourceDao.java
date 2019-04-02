package com.example.yanyue.dao;

import com.example.yanyue.pojo.RoleResource;

public interface RoleResourceDao {
    int deleteByPrimaryKey(Integer rrId);

    int insert(RoleResource record);

    int insertSelective(RoleResource record);

    RoleResource selectByPrimaryKey(Integer rrId);

    int updateByPrimaryKeySelective(RoleResource record);

    int updateByPrimaryKey(RoleResource record);
}