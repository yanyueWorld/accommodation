package com.example.yanyue.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.yanyue.pojo.Account;
import com.example.yanyue.pojo.common.Result;
import com.example.yanyue.pojo.vo.AccountVO;
import com.example.yanyue.service.AccountService;
import com.github.pagehelper.PageInfo;

/**
 * @Author yanyue
 * @Description 账户信息视图控制层
 * @Date 13:24 2019/3/25
 * @Version 1.0
 **/
@Controller
public class AccountController {
    @Autowired
    private AccountService accountServer;

    /**
     * @Author yanyue
     * @Description 登录
     * @Date 14:12 2019/3/25
     * @Param accountName 账户名，password 密码，request HttpServletRequest请求
     * @return Account 账户信息
     **/
    @ResponseBody
    @PostMapping("/login")
    @CrossOrigin
    public Account login(String accountName, String password, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Account account = accountServer.login(accountName, password);

        if (account != null) {
            if (session.getAttribute("accountName") == null) {
                session.setAttribute("accountName", account.getAccountName());
                session.setAttribute("accountId", account.getAccountId());
            }
        }
        return account;
    }

    /**
     * @Author yanyue
     * @Description 退出
     * @Date 14:16 2019/3/25
     * @Param HttpServletRequest request请求
     * @return String 页面跳转
     **/
    @RequestMapping("/logout")
    @ResponseBody
    @CrossOrigin
    public String logout(HttpServletRequest request) {
        String msg;
        HttpSession session = request.getSession();
        session.removeAttribute("accountName");
        session.removeAttribute("accountId");
        session.invalidate();
        msg = "注销成功,马上跳转为登录界面！！";
        String content = "<script>"
                + "setTimeout(function(){window.location.href='login.html'},2000)" + "</script>";
        // System.out.println(msg);
        return msg + content;
    }

    /**
     * @Author 严悦
     * @Description 获取账户信息
     * @Date 14:17 2019/3/25
     * @Param Integer page当前页面,Integer limit每页大小, AccountVO accountVO 账户视图对象
     * @return List 账户对象
     **/
    @RequestMapping("/getAccountsByExample")
    @ResponseBody
    @CrossOrigin
    public Result<List<Account>> fidndAllCustomers(@RequestParam(value = "page", defaultValue = "1", required = false) Integer currentPage,
                                                   @RequestParam(value = "limit", defaultValue = "10", required = false) Integer pageSize,
                                                   AccountVO accountVO) {
        accountVO.setStatus(0);
        List<Account> accounts = accountServer.getAccountsByExample(currentPage, pageSize,
                accountVO);
        Result<List<Account>> result;
        result = Result.success(accounts);
        PageInfo<Account> pageInfo = new PageInfo<>(accounts);
        result.setCount(pageInfo.getTotal());
        return result;
    }

    /**
     * @Author yanyue
     * @Description 根据Id寻找账户id
     * @Date 14:21 2019/3/25
     * @Param Integer accountId 账户id
     * @return Account 账户对象
     **/
    @RequestMapping("/getAccountByAccountId")
    @ResponseBody
    @CrossOrigin
    public Account getAccountByAccountId(Integer accountId) {
        Account account;
        if (accountId == null) {
            account = new Account();
        } else {
            account = accountServer.getAccountByAccountId(accountId);
            if (account == null) {
                account = new Account();
            }
        }
        return account;
    }

    /**
     * @Author yanyue
     * @Description 部分修改账户信息
     * @Date 14:25 2019/3/25
     * @Param Account 账户对象
     * @return int 操作结果
     **/
    @RequestMapping("/modify")
    @ResponseBody
    @CrossOrigin
    public int updateByPrimaryKeySelective(Account account) {
        if (account == null) {
            return -1;
        }
        return accountServer.updateByPrimaryKeySelective(account);
    }

}
