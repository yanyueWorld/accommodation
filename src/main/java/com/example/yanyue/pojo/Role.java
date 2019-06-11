package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
/**
 * @ClassName Role
 * @Author yanyue
 * @Description 角色实体类
 * @Date 10:13 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class Role implements Serializable {

    private Integer roleId;//角色id
    private String roleName;//角色名
}