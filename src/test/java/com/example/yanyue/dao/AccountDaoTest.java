package com.example.yanyue.dao;

import com.example.yanyue.pojo.vo.AccountVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.rules.SpringClassRule;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountDaoTest {
    @Autowired
    private AccountDao accountDao;

    @Test
    public void getAll(){
        System.out.println( accountDao.getAccountsByExample(1,5,null));
        System.out.println(accountDao.getAccountsByExample(1,5,new AccountVO()));

    }
}