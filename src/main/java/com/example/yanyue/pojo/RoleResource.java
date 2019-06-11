package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
/**
 * @ClassName RoleResoruce
 * @Author yanyue
 * @Description 角色资源实体类
 * @Date 10:14 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class RoleResource implements Serializable {

    private Integer rrId;//角色资源id
    private Integer roleId;//角色id
    private Integer resourceId;//资源id

}