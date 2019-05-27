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
     * 登录
     * 路径： /account/login
     * @Param accountName 账户名
     * @Param password 密码
     * @Param request HttpServletRequest请求
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
            return account;
        }else{
            return new Account();
        }
    }

    /**
     * @Author yanyue
     * 退出
     * 路径： /account/logout
     * @Param HttpServletRequest request请求,前端不需要参数传递
     * @return String 页面跳转
     **/
    @RequestMapping("logout")
    @ResponseBody
    @CrossOrigin
    public String logout(HttpServletRequest request) {
        System.out.println("hello");
        HttpSession session = request.getSession();
        session.removeAttribute("accountName");
        session.removeAttribute("accountId");
        session.invalidate();
        return "退出成功";
    }

    /**
     * @Author yanyue
     * 获取账户信息
     * 路径： /account/getAccountsByExample
     * @Param page 当前页面
     * @Param limit 每页大小
     * @Param accountVO 账户视图对象,json数据，前端可以不用参数传递
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
     * 从session中获取账户id，查询出账户信息
     * 路径： /account/getAccountName
     * @Param request request请求，前端不用参数传递
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
     * 根据Id寻找账户id
     * 路径： /account/getAccountByAccountId
     * @Param  accountId 账户id 需要参数传递
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
     * 部分修改账户信息
     * 路径： /account/modify
     * @Param Account 账户对象,json数据对象
     * @return int 操作结果，小于等于0的为失败
     **/
    @RequestMapping("/modify")
    @ResponseBody
    @CrossOrigin
    public int updateByPrimaryKeySelective(@RequestBody Account account) {
        if (account == null) {
            return -1;
        }
        if(account.getAccountId()==null||account.getAccountId()==0){
            return -2;
        }
        return accountServer.updateByPrimaryKeySelective(account);
    }

    /**
     * @Author yanyue
     * 新增用户信息
     * 路径： /account/insert
     * @Param account account json对象数据
     * @Param roleId,角色权限，管理员:1,商家:2,用户:3
     * @return int 新增行数，操作结果，小于等于0的为失败
     **/
    @RequestMapping("/insert")
    @ResponseBody
    @CrossOrigin
    public int insertAccount(@RequestBody Account account,Integer roleId){
        return accountServer.insertAccount(account,roleId);

    }
}
