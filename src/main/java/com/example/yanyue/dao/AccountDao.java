package com.example.yanyue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.yanyue.pojo.Account;
import com.example.yanyue.pojo.vo.AccountVO;

/**
 * @ClassName AccountDao
 * @Author yanyue
 * @Description 账户信息数据操作接口
 * @Date 13:14 2019/3/25
 * @Version 1.0
 **/
public interface AccountDao {
    /**
     * @Author yanyue
     * @Description 按照账户id删除信息
     * @Date 10:21 2019/3/11
     * @Param accountId 账户id int类型
     * @return int 操作行数
     **/
    int deleteByPrimaryKey(Integer accountId);

    /**
     * @Author yanyue
     * @Description 新增账户信息
     * @Date 10:22 2019/3/11
     * @Param account 账户信息 Account对象类型
     * @return int 操作行数
     **/
    int insert(Account account);

    /**
     * @Author yanyue
     * @Description 新增账户信息，部分信息不完善性新增
     * @Date 10:25 2019/3/11
     * @Param account 账户信息 Account对象类型
     * @return int 操作行数
     **/
    int insertSelective(Account account);

    /**
     * @Author yanyue
     * @Description 根据id修改账户部分信息
     * @Date 9:18 2019/3/12
     * @Param 账户对象 Account对象类型
     * @return int 操作行数
     **/
    int updateByPrimaryKeySelective(Account record);

    /**
     * @Author yanyue
     * @Description 查询所有用户
     * @Date 16:09 2019/3/3
     * @Param
     * @return List 账户对象列表
     **/
    List<Account> getAccountsByExample(@Param("page") Integer currentPage,
                                       @Param("limit") Integer pageSize,
                                       @Param("accountVO") AccountVO accountVO);

    /**
     * @Author yanyue
     * @Description 根据用户名查询 登录使用
     * @Date 16:10 2019/3/3
     * @Param accountName 用户名
     * @return Account 账户对象
     **/
    Account login(String accountName, String password);

    /**
     * @Author yanyue
     * @Description 根据账户id查询账户信息
     * @Date 14:23 2019/3/18
     * @Param accountId 账户id
     * @return Account 账户对象
     **/
    Account getAccountByAccountId(Integer accountId);


    Integer getAccountIdByIdNumber(String idNumber);
}