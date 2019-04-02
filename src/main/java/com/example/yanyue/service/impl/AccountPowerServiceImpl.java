package com.example.yanyue.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yanyue.dao.AccountPowerVODao;
import com.example.yanyue.pojo.vo.AccountPowerVO;
import com.example.yanyue.service.AccountPowerService;

/**
 * @ClassName AccountPowerServerssImpl
 * @Author yanyue
 * @Description 账户权限视图业务处理接口实现
 * @Date 13:26 2019/3/25
 * @Version 1.0
 **/
@Service
public class AccountPowerServiceImpl implements AccountPowerService {
    @Autowired
    private AccountPowerVODao accountPowerDao;

    @Override
    public List<AccountPowerVO> getAccountPowerByAccountId(Integer id) {
        if (id == null) {
            id = 0;
        }
        List<AccountPowerVO> accountPowerVOs = accountPowerDao.getAccountPowerByAcccountId(id);
        if (accountPowerVOs == null || accountPowerVOs.size() == 0) {
            accountPowerVOs = new ArrayList<>();
        }
        return accountPowerVOs;
    }
}
