package com.example.yanyue.service;

import com.example.yanyue.pojo.Account;
import com.example.yanyue.pojo.vo.AccountVO;

import java.util.List;

/**
 * @ClassName AccountSerice
 * @Author yanyue
 * @Description 账户信息业务处理接口
 * @Date 13:16 2019/3/25
 * @Version 1.0
 **/
public interface AccountService {
    /**
     * @Author yanyue
     * @Description 登录
     * @Date 9:40 2019/3/12
     * @Param 账户名 String类型，密码 String类型
     * @return Account Account对象
     **/
    Account login(String accountName, String password);

    /**
     * @Author yanyue
     * @Description  查询所有用户
     * @Date 16:09 2019/3/3
     * @Param
     * @return List<Account> 账户对象列表
     **/
    List<Account> getAccountsByExample(Integer currentPage, Integer pageSize, AccountVO accountVO);

    /**
     * @Author yanyue
     * @Description 根据账户id查询账户信息，并做业务处理
     * @Date 14:42 2019/3/18
     * @Param accountName 账户名
     * @return Account 账户对象
     **/
    Account getAccountByAccountId(Integer accountId);

    /**
     * @Author yanyue
     * @Description 根据账户id找到账户信息，并且做部分或者全部修改
     * @Date 9:17 2019/3/19
     * @Param account Account对象
     * @return int 是否成功 <0 失败
     **/
    int updateByPrimaryKeySelective(Account account);
}