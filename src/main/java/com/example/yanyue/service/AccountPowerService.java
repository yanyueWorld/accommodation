package com.example.yanyue.service;

import com.example.yanyue.pojo.vo.AccountPowerVO;

import java.util.List;

public interface AccountPowerService {

    /**
     * @Author yanyue
     * @Description 根据账户id查询账户权限
     * @Date 10:28 2019/3/11
     * @Param accountId
     * @return List 账户权限列表
     **/
    List<AccountPowerVO> getAccountPowerByAccountId(Integer id);
}
