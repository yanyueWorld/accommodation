package com.example.yanyue.pojo;

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

    public Integer getInforId() {
        return inforId;
    }

    public void setInforId(Integer inforId) {
        this.inforId = inforId;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAppartmentId() {
        return appartmentId;
    }

    public void setAppartmentId(Integer appartmentId) {
        this.appartmentId = appartmentId;
    }

    public BigDecimal getPrePay() {
        return prePay;
    }

    public void setPrePay(BigDecimal prePay) {
        this.prePay = prePay;
    }

    public BigDecimal getRelPay() {
        return relPay;
    }

    public void setRelPay(BigDecimal relPay) {
        this.relPay = relPay;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}