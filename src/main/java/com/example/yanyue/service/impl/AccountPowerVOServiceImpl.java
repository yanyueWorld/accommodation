package com.example.yanyue.service.impl;

import com.example.yanyue.dao.AccountPowerVODao;
import com.example.yanyue.pojo.vo.AccountPowerVO;
import com.example.yanyue.service.AccountPowerVOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountPowerVOServiceImpl implements AccountPowerVOService {
    @Autowired
    private AccountPowerVODao accountPowerVODao;
    @Override
    public List<AccountPowerVO> getAccountPowers(Integer accountId) {

        if(accountId==0||accountId==null){
            return new ArrayList<>();
        }
        List<AccountPowerVO> accountPowerVOS=accountPowerVODao.getAccountPowers(accountId);
        if(accountPowerVOS==null||accountPowerVOS.size()==0){
            return new ArrayList<>();
        }
        return accountPowerVOS;
    }

}
