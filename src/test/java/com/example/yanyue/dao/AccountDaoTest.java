package com.example.yanyue.dao;

import com.example.yanyue.pojo.Account;
import com.example.yanyue.pojo.vo.AccountVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountDaoTest {
    @Autowired
    private AccountDao accountDao;

    @Test
    public void selectByAccountName(){
         System.out.println(accountDao.login("admin","123456"));
     }

     @Test
    public void getAccountsByExample(){
         AccountVO accountVO=new AccountVO();
         System.out.println(accountDao.getAccountsByExample(1,10,accountVO));
     }

    @Test
    public void getAccountByAccountId(){
        System.out.println(accountDao.getAccountByAccountId(1));
    }

    @Test
    public void updateByPrimaryKeySelective(){
        Account account=new Account();
        account.setStatus(1);
        account.setAccountId(1);
        accountDao.updateByPrimaryKeySelective(account);
        System.out.println(accountDao.getAccountByAccountId(1));
    }

    @Test
    public void getAccountIdByIdNumber(){
        System.out.println(accountDao.getAccountIdByIdNumber("513226199401231234"));
    }
}