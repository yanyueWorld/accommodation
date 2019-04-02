package com.example.yanyue.service;


import com.example.yanyue.pojo.vo.AccountPowerVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountPowerServiceTest {
    @Autowired
    private AccountPowerService accountPowerService;

    @Test
    public void getAccountPowerByAccountId(){
        Integer id=null;
        List<AccountPowerVO> accountPowerVOS=accountPowerService.getAccountPowerByAccountId(id);
        System.out.println(accountPowerVOS);
        accountPowerVOS=accountPowerService.getAccountPowerByAccountId(1);
        System.out.println(accountPowerVOS);
    }

}