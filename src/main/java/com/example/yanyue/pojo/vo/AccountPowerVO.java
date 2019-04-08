package com.example.yanyue.pojo.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Author yanyue
 * @Description 账户权限视图类
 * @Date 10:33 2019/3/25
 **/
@Getter
@Setter
public class AccountPowerVO implements Serializable {

    private Integer accountId;//账户id
    private String accountName;//账户名
    private String password;//密码
    private String resourceName;//资源名
    private String url;//资源路径
    private Integer resourceId;//资源id
    private Integer resourcePid;
    private List<AccountPowerVO> children;

    public AccountPowerVO(Integer accountId, String accountName, String password, String resourceName, String url, Integer resourceId) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.password = password;
        this.resourceName = resourceName;
        this.url = url;
        this.resourceId = resourceId;
    }

    public AccountPowerVO() {
    }

    @Override
    public String toString() {
        return "AccountPowerVO{" + "accountId=" + accountId + ", accountName='" + accountName + '\'' + ", password='" + password + '\'' + ", resourceName='" + resourceName + '\'' + ", url='" + url + '\'' + ", resourcePid=" + resourceId + '}';
    }
}
