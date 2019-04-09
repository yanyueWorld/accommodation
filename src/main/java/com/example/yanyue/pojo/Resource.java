package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
/**
 * @ClassName Resource
 * @Author yanyue
 * @Description 资源实体类
 * @Date 10:12 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class Resource implements Serializable {
    private Integer resourceId;//资源id
    private String resourceName;//资源名
    private String url;//资源路径
    private String icon;//图标
    private Integer resourcePid;//父类id


}