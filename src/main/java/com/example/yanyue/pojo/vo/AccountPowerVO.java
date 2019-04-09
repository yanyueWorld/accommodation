package com.example.yanyue.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
/**
 * @Author yanyue
 * @Description 账户权限视图类
 * @Date 10:33 2019/3/25
 **/
@Getter
@Setter
@ToString
public class AccountPowerVO implements Serializable {

    private Integer accountId;//账户id
    private String accountName;//账户名
    private String password;//密码
    private String resourceName;//资源名
    private String url;//资源路径
    private Integer resourceId;//资源id
    private Integer resourcePid;//资源父id
    private String icon;//图标

}
