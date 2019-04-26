package com.example.yanyue.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @ClassName AppartmentVO
 * @Description 公寓视图对象2
 * @Author yanyue
 * @Date 2019/3/27 10:56
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
public class AppartmentVO {
    private Integer apartmentId;//公寓id
    private String typeName;//类型id
    private String apartmentName;//公寓名
    private BigDecimal price;//单价
    private String address;//地址
    private String name;//所有者
    private BigDecimal beginPrice;//起始价格
    private BigDecimal endPrice;//终止价格

}
