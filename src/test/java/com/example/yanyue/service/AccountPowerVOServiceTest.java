package com.example.yanyue.service;

import com.example.yanyue.pojo.vo.AccountPowerVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountPowerVOServiceTest {
    @Autowired
    private AccountPowerVOService accountPowerVOService;

    @Test
    public void getAccountPowers(){
        List<AccountPowerVO> accountPowerVOs;
        accountPowerVOs=accountPowerVOService.getAccountPowers(0);
        System.out.println(accountPowerVOs);
        accountPowerVOs=accountPowerVOService.getAccountPowers(1);
        System.out.println(accountPowerVOs);
    }

}