package com.example.yanyue.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName Account
 * @Author yanyue
 * @Description 账户表实体类
 * @Date 9:29 2019/3/25
 * @Version 1.0
 **/
public class Account implements Serializable {

    private Integer accountId;// 账户id
    private String gender;// 性别
    private String idNumber;// 身份证号码
    private Date birth;// 出生日期
    private String password;// 登录密码
    private String name;// 真实姓名
    private String accountName;// 账户名
    private String telephone;// 联系电话
    private BigDecimal remainderMoney;// 余额
    private Integer status;// 状态

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getGender() {
        if ("0".equals(gender)) {
            gender = "女";
        }
        if ("1".equals(gender)) {
            gender = "男";
        }
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public BigDecimal getRemainderMoney() {
        return remainderMoney;
    }

    public void setRemainderMoney(BigDecimal remainderMoney) {
        this.remainderMoney = remainderMoney;
    }

    public Account() {

    }

    public Account(Integer accountId, String gender, String idNumber, Date birth, String password,
            String name, String accountName, String telephone, BigDecimal remainderMoney,
            Integer status) {
        this.accountId = accountId;
        this.gender = gender;
        this.idNumber = idNumber;
        this.birth = birth;
        this.password = password;
        this.name = name;
        this.accountName = accountName;
        this.telephone = telephone;
        this.remainderMoney = remainderMoney;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" + "accountId=" + accountId + ", gender='" + gender + '\'' + ", idNumber='"
                + idNumber + '\'' + ", birth=" + birth + ", password='" + password + '\''
                + ", name='" + name + '\'' + ", accountName='" + accountName + '\''
                + ", telephone='" + telephone + '\'' + ", remainderMoney=" + remainderMoney
                + ", status=" + status + '}';
    }
}