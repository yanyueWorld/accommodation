package com.example.yanyue.dao;

import com.example.yanyue.pojo.AccountRole;

public interface AccountRoleDao {
    int deleteByPrimaryKey(Integer arId);

    int insert(AccountRole record);

    int insertSelective(AccountRole record);

    AccountRole selectByPrimaryKey(Integer arId);

    int updateByPrimaryKeySelective(AccountRole record);

    int updateByPrimaryKey(AccountRole record);
}