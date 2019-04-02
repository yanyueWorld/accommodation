package com.example.yanyue.pojo;

import java.io.Serializable;

/**
 * @ClassName AccountRole
 * @Author desktop
 * @Description 账户角色实体类
 * @Date 9:29 2019/3/25
 * @Version 1.0
 **/
public class AccountRole implements Serializable {

    private Integer arId;// 账户角色id
    private Integer accountId;// 账户id
    private Integer roleId;// 角色id

    public Integer getArId() {
        return arId;
    }

    public void setArId(Integer arId) {
        this.arId = arId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public AccountRole() {
    }

    public AccountRole(Integer arId, Integer accountId, Integer roleId) {
        this.arId = arId;
        this.accountId = accountId;
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "AccountRole{" + "arId=" + arId + ", accountId=" + accountId + ", roleId=" + roleId
                + '}';
    }
}