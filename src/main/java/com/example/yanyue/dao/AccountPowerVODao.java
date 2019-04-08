package com.example.yanyue.dao;

import java.util.List;

import com.example.yanyue.pojo.vo.AccountPowerVO;

/**
 * @ClassName AccountPowerVODao
 * @Description TODO
 * @Author yanyue
 * @Date 2019/3/25 15:07
 * @Version 1.0
 **/
public interface AccountPowerVODao {
    /**
     * @Author yanyue
     * @Description 根据账户id查询账户权限
     * @Date 10:28 2019/3/11
     * @Param accountId
     * @return List 账户权限列表
     **/
    List<AccountPowerVO> getAccountPowers(Integer accountId);

}
