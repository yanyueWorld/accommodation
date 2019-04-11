package com.example.yanyue.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
/**
 * @Author desktop
 * @Description 账户视图类
 * @Date 10:34 2019/3/25
 * @Param 
 * @return 
 **/
@Getter
@Setter
@ToString
public class AccountVO implements Serializable {

    private Integer accountId;//账户id
    private String accountName;//账户名
    private String gender;//性别
    private String name;//姓名
    private Date birth;//出生日期
    private String telphone;//联系电话
    private Double remainderMoney;//余额
    private Integer roleId;//角色id
    private String idNumber;//身份证号码
    private Integer status;//账户状态
    private String role_name;//角色名


    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getGender() {
        if("0".equals(gender)){
            gender="女";
        }
        if("1".equals(gender)){
            gender="男";
        }
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Double getRemainderMoney() {
        return remainderMoney;
    }

    public void setRemainderMoney(Double remainderMoney) {
        this.remainderMoney = remainderMoney;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AccountVO() {
    }

    public AccountVO(Integer accountId, String accountName, String gender, String name, Date birth, String telphone, Double remainderMoney, Integer roleId, Integer status, String role_name) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.gender = gender;
        this.name = name;
        this.birth = birth;
        this.telphone = telphone;
        this.remainderMoney = remainderMoney;
        this.roleId = roleId;
        this.status = status;
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "AccountVO{" + "accountId=" + accountId + ", accountName='" + accountName + '\'' + ", gender='" + gender + '\'' + ", name='" + name + '\'' + ", birth=" + birth + ", telphone='" + telphone + '\'' + ", remainderMoney=" + remainderMoney + ", roleId=" + roleId + ", status=" + status + ", role_name='" + role_name + '\'' + '}';
    }
}
