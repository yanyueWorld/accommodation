package com.example.yanyue.pojo;

import java.io.Serializable;
/**
 * @ClassName Role
 * @Author yanyue
 * @Description 角色实体类
 * @Date 10:13 2019/3/25
 * @Version 1.0
 **/
public class Role implements Serializable {

    private Integer roleId;//角色id
    private String roleName;//角色名

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}