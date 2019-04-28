package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName AttrVal
 * @Author yanyue
 * @Description 属性值表
 * @Date 9:51 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class AttrVal implements Serializable {

    private Integer attrValId;
    private Integer attrId;
    private Integer valId;
}