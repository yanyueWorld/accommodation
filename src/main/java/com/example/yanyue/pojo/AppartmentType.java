package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName AppartmentType
 * @Author 严悦
 * @Description 公寓类别表
 * @Date 9:45 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class AppartmentType implements Serializable {

    private Integer typeId;// 类别id
    private String typeName;// 类别名
}