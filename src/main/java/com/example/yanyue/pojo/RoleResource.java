package com.example.yanyue.pojo;

import java.io.Serializable;
/**
 * @ClassName RoleResoruce
 * @Author yanyue
 * @Description 角色资源实体类
 * @Date 10:14 2019/3/25
 * @Version 1.0
 **/
public class RoleResource implements Serializable {

    private Integer rrId;//角色资源id
    private Integer roleId;//角色id
    private Integer resourceId;//资源id

    public Integer getRrId() {
        return rrId;
    }

    public void setRrId(Integer rrId) {
        this.rrId = rrId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}