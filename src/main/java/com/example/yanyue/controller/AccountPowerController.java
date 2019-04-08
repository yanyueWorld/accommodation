package com.example.yanyue.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName AccountPowerController
 * @Author yanyue
 * @Description 账户权限操作控制类
 * @Date 14:58 2019/3/25
 * @Version 1.0
 **/
@Controller
public class AccountPowerController {
//    @Autowired
//    private AccountPowerService accountPowerService;
//
//    /**
//     * @Author yanyue
//     * @Description 获取账户权限
//     * @Date 14:59 2019/3/25
//     * @Param HttpServletRequest request
//     * @return List
//     **/
//    @PostMapping("/getAccountPower")
//    @ResponseBody
//    public List<AccountPowerVO> getAccountPowerByAccountId(HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        List<AccountPowerVO> accountPowerVOs;
//        if (session.getAttribute("accountId") == null) {
//            accountPowerVOs = new ArrayList<>();
//        } else {
//            Integer accountId = Integer.parseInt(session.getAttribute("accountId").toString());
//            accountPowerVOs = accountPowerService.getAccountPowerByAccountId(accountId);
//        }
//        if (accountPowerVOs == null || accountPowerVOs.size() == 0) {
//            accountPowerVOs = new ArrayList<>();
//        }
//        return accountPowerVOs;
//    }
}
