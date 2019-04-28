package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName Appartment
 * @Author yanyue
 * @Description 公寓实体类
 * @Date 9:42 2019/3/25
 * @Version 1.0
 **/

@Setter
@Getter
@ToString
public class Appartment implements Serializable {

    private Integer apartmentId;// 公寓id
    private Integer typeId;// 类型id
    private Integer attrId;// 属性id
    private String apartmentName;// 公寓名
    private BigDecimal price;// 单价
    private String address;// 地址
    private Integer owner;// 所有者
    private Integer status;//状态

    private AppartmentType appartmentType;// 公寓类型对象
    private Account account;// 账户对象


}