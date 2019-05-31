package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @className Order
 * @Author yanyue
 * @Description 订单实体类
 * @Date 10:05 2019/3/25
 * @Version 1.0
 **/

@ToString
@Getter
@Setter
public class Order implements Serializable {

    private Integer orderId;//订单id
    private Integer accountId;//账户id
    private Integer apartmentId;//公寓id
    private BigDecimal prePay;//定金
    private String status;//订单状态
    private Date checkInDate;//预计入住时间
    private Date checkOutDate;//预计签退时间
    Appartment appartment;//公寓对象


}