package com.example.yanyue.dao;

import com.example.yanyue.pojo.Account;
import com.example.yanyue.pojo.common.MenuTreeVO;
import com.example.yanyue.pojo.vo.AccountPowerVO;
import com.example.yanyue.util.TreeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountPowerDaoTest {
    @Autowired
    private AccountPowerVODao accountPowerDao;

    @Test
    public void getAccountPowerByAcccountId(){
        List<AccountPowerVO> accountPowerVOs=accountPowerDao.getAccountPowers(1);
        System.out.println(accountPowerVOs);
        List<MenuTreeVO> menuTreeVOs=new ArrayList<>();
        for(AccountPowerVO accountPowerVO:accountPowerVOs){
            MenuTreeVO menuTreeVO=new MenuTreeVO();
            BeanUtils.copyProperties(accountPowerVO,menuTreeVO);
            menuTreeVOs.add(menuTreeVO);
        }
        System.out.println(menuTreeVOs);
        System.out.println(TreeUtil.toTree(menuTreeVOs));
    }

}