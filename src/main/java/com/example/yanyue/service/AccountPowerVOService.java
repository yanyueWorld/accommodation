package com.example.yanyue.service;

import com.example.yanyue.pojo.vo.AccountPowerVO;

import java.util.List;

public interface AccountPowerVOService {
    List<AccountPowerVO> getAccountPowers(Integer accountId);
}
