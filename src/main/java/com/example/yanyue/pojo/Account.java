package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
@Getter
@Setter
@ToString
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

    public String getGender() {
        if ("0".equals(gender)) {
            gender = "女";
        }
        if ("1".equals(gender)) {
            gender = "男";
        }
        return gender;
    }
}