package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName AccountRole
 * @Author desktop
 * @Description 账户角色实体类
 * @Date 9:29 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class AccountRole implements Serializable {

    private Integer arId;// 账户角色id
    private Integer accountId;// 账户id
    private Integer roleId;// 角色id
}