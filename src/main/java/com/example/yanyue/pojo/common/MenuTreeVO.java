/*
 * Copyright (c) .
 * All Rights Reserved.
 */
package com.example.yanyue.pojo.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * MenuTreeVO.
 *
 * @author yanyue, 2019/4/7
 * @version ORAS v1.0
 */
@Getter
@Setter
@ToString
public class MenuTreeVO {

    private String resourceName;//资源名
    private String url;//资源路径
    private Integer resourceId;//资源id
    private Integer resourcePid;//资源父id
    private List<MenuTreeVO> children;//子信息
}