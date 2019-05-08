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


@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountServer;

    /**
     * @Author yanyue
     * @Description 登录
     * @url /account/login
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
     * @url /account/logout
     * @Param HttpServletRequest request请求,前端不需要参数传递
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
     * @Author yanyue
     * @Description 获取账户信息
     * @url /account/getAccountsByExample
     * @Param Integer page当前页面,Integer limit每页大小, AccountVO accountVO 账户视图对象 json数据，前端可以不用参数传递
     * @return List 账户对象
     **/
    @RequestMapping(value = "/getAccountsByExample")
    @ResponseBody
    @CrossOrigin
    public Result<List<Account>> fidndAllCustomers(@RequestParam(value = "page", defaultValue = "1", required = false) Integer currentPage,
                                                   @RequestParam(value = "limit", defaultValue = "5", required = false) Integer pageSize,
                                                   @RequestBody  AccountVO accountVO) {
        accountVO.setStatus(0);
        System.out.println(pageSize);
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
     * @Description 从session中获取账户id，查询出账户信息
     * @url /account/getAccountName
     * @Param [request] request请求，前端不用参数传递
     * @return Account 账户信息
     **/
    @RequestMapping("/getAccountName")
    @ResponseBody
    @CrossOrigin
    public Account getAccountBySession(HttpServletRequest request){
        HttpSession session=request.getSession();
        Integer accountId=Integer.parseInt(session.getAttribute("accountId").toString());
        if(accountId==null||accountId==0){
            return new Account();
        }
        return accountServer.getAccountByAccountId(accountId);
    }
    /**
     * @Author yanyue
     * @Description 根据Id寻找账户id
     * @url /account/getAccountByAccountId
     * @Param Integer accountId 账户id 需要参数传递
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
     * @url /account/modify
     * @Param Account 账户对象 json数据对象
     * @return int 操作结果 小于等于0的为失败
     **/
    @RequestMapping("/modify")
    @ResponseBody
    @CrossOrigin
    public int updateByPrimaryKeySelective(@RequestBody Account account) {
        if (account == null) {
            return -1;
        }
        return accountServer.updateByPrimaryKeySelective(account);
    }

    /**
     * @Author yanyue
     * @Description  新增用户信息
     * @url /account/insert
     * @Param [account, roleId] account json对象数据，roleId,角色权限，管理员:1,商家:2,用户:3
     * @return int 新增行数，操作结果 小于等于0的为失败
     **/
    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public int insertAccount(@RequestBody Account account,Integer roleId){
        return accountServer.insertAccount(account,roleId);

    }
}
