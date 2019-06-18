package com.example.yanyue.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.example.yanyue.pojo.common.MenuTreeVO;
import com.example.yanyue.pojo.vo.AccountPowerVO;
import com.example.yanyue.service.AccountPowerVOService;
import com.example.yanyue.util.TreeUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountPowerController {
    @Autowired
    private AccountPowerVOService accountPowerVOService;

    /**
     * @Author yanyue
     * 获取账户权限
     * 路径： /getAccountPower
     * @Param  request 请求参数,不需要参数传递
     * @return List 后台菜单列表
     **/
    @RequestMapping("/getAccountPower")
    @ResponseBody
    @CrossOrigin()
    public List<MenuTreeVO> getAccountPowerByAccountId(HttpServletRequest request) {
          HttpSession session = request.getSession();
          List<AccountPowerVO> accountPowerVOs;
          System.out.println(session.getAttribute("accountId"));
         if (session.getAttribute("accountId") == null) {
             accountPowerVOs = new ArrayList<>();
         } else {
            Integer accountId = Integer.parseInt(session.getAttribute("accountId").toString());
            accountPowerVOs = accountPowerVOService.getAccountPowers(accountId);
        }
        if (accountPowerVOs == null || accountPowerVOs.size() == 0) {
            accountPowerVOs = new ArrayList<>();
        }
        List<MenuTreeVO> menuTreeVOS=new ArrayList<>();
        for(AccountPowerVO accountPowerVO:accountPowerVOs){
            MenuTreeVO menuTreeVO=new MenuTreeVO();
            BeanUtils.copyProperties(accountPowerVO,menuTreeVO);
            menuTreeVOS.add(menuTreeVO);
        }

        return TreeUtil.toTree(menuTreeVOS);
    }
}
