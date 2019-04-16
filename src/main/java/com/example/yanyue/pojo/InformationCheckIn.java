package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName informationCheckIn
 * @Author yanyue
 * @Description 入住信息实体类
 * @Date 9:53 2019/3/25
 * @Version 1.0
 **/
@ToString
@Getter
@Setter
public class InformationCheckIn implements Serializable {

    private Integer inforId;// 信息表id
    private Date checkInDate;// 入住时间
    private Date checkOutDate;// 退房时间
    private Integer status;// 订单状态
    private Integer accountId;// 账户id
    private Integer appartmentId;// 公寓id
    private BigDecimal prePay;// 预付金额
    private BigDecimal relPay;// 实际金额
    private Integer numberOfPeople;// 入住人数


}