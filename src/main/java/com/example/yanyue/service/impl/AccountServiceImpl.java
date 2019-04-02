package com.example.yanyue.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yanyue.dao.AccountDao;
import com.example.yanyue.pojo.Account;
import com.example.yanyue.pojo.vo.AccountVO;
import com.example.yanyue.service.AccountService;

/**
 * @ClassName AccountServerImpl
 * @Author yanyue
 * @Description 账户信息业务处理接口实现
 * @Date 13:16 2019/3/25
 * @Version 1.0
 **/

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public Account login(String accountName, String password) {

        Account account;
        // 参数判空处理
        if (accountName == null || accountName.length() == 0) {
            accountName = "";
        }
        if (password == null || password.length() == 0) {
            password = "";
        }
        account = accountDao.login(accountName, password);

        // 结果判空处理
        if (account == null) {
            account = new Account();
        }
        return account;
    }

    @Override
    public List<Account> getAccountsByExample(Integer currentPage, Integer pageSize,
                                              AccountVO accountVO) {
        List<Account> accounts = accountDao.getAccountsByExample(currentPage, pageSize, accountVO);
        if (accounts == null || accounts.size() == 0) {
            accounts = new ArrayList<>();
        }
        return accounts;
    }

    @Override
    public Account getAccountByAccountId(Integer accountId) {
        Account account = null;
        if (accountId == null || accountId == 0) {
            account = new Account();
        } else {
            account = accountDao.getAccountByAccountId(accountId);
            if (account == null) {
                account = new Account();
            }
        }
        return account;
    }

    @Override
    public int updateByPrimaryKeySelective(Account account) {
        int result = -1;
        if (account == null) {
            return result;
        } else {
            result = accountDao.updateByPrimaryKeySelective(account);
            return result;
        }
    }

}