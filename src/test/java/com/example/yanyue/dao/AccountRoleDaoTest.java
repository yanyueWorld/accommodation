package com.example.yanyue.dao;

import com.example.yanyue.pojo.AccountRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRoleDaoTest {
    @Autowired
    AccountRoleDao accountRoleDao;

    @Test
    public void getAll(){
        System.out.println(accountRoleDao.getAll(null));
        System.out.println(accountRoleDao.getAll(new AccountRole(null,1,null)));
    }

    @Test
    public void insert(){
        System.out.println(accountRoleDao.insertSelective(new AccountRole(null,1,null)));
    }

    @Test
    public void delete(){
        System.out.println(accountRoleDao.deleteByPrimaryKey(14));
    }

    @Test
    public void update(){
        System.out.println(accountRoleDao.updateByPrimaryKeySelective(new AccountRole(14,1,1)));
    }
}