package com.example.yanyue.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.yanyue.pojo.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServerTest {

    @Autowired
    private AccountService accountServer;

    @Test
    public void login() {
        String accountName = "";
        String password = "";
        Account account1 = accountServer.login(accountName, password);
        accountName = "admin";
        password = "123456";
        Account account = accountServer.login(accountName, password);

        // 结果判空处理
        if (account == null) {
            account = new Account();
        }
        System.out.println(account);
    }

    @Test
    public void getAccountsByExample() {
        List<Account> accounts = null;

        if (accounts == null || accounts.size() == 0) {
            accounts = new ArrayList<>();
        }
        accounts = accountServer.getAccountsByExample(1, 10, null);
        System.out.println(accounts);
    }

    @Test
    public void getAccountByAccountId() {
        Integer accountId = 0;
        Account account = accountServer.getAccountByAccountId(accountId);
        System.out.println(account);
        accountId=0;
        account=accountServer.getAccountByAccountId(accountId);
        System.out.println(account);
        accountId = 1;
        account = accountServer.getAccountByAccountId(accountId);
        System.out.println(account);
    }

    @Test
    public void updateByPrimaryKeySelective(){
        Account account=null;
        int result;
        result=accountServer.updateByPrimaryKeySelective(account);
        System.out.println(result);
        account=new Account();
        account.setStatus(1);
        account.setAccountId(1);
        result=accountServer.updateByPrimaryKeySelective(account);
        System.out.println(result);
    }

    @Test
    public void insert(){
        Account account=new Account();
        account.setIdNumber("513513197612121233");
        int result=accountServer.insertAccount(account);
        System.out.println(result);
    }
}