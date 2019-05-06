package com.example.yanyue.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
public class OrderVO implements Serializable {

    private String accountName;//账户名
    private String apartmentName;//公寓名
    private Integer orderId;//订单id
    private Integer accountId;//账户id
    private Integer apartmentId;//公寓id
    private BigDecimal prePay;//定金
    private String status;//订单状态
    private Date checkInDate;//预计入住时间
    private Date checkOutDate;//预计签退时间
    private BigDecimal price;//单价
    private BigDecimal total;//总额

}
