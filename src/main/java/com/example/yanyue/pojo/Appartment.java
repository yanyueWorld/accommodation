package com.example.yanyue.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName Appartment
 * @Author yanyue
 * @Description 公寓实体类
 * @Date 9:42 2019/3/25
 * @Version 1.0
 **/
public class Appartment implements Serializable {

    private Integer apartmentId;// 公寓id
    private Integer typeId;// 类型id
    private Integer attrId;// 属性id
    private String apartmentName;// 公寓名
    private BigDecimal price;// 单价
    private String address;// 地址
    private Integer owner;// 所有者

    private AppartmentType appartmentType;// 公寓类型对象
    private Account account;// 账户对象

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public AppartmentType getAppartmentType() {
        return appartmentType;
    }

    public void setAppartmentType(AppartmentType appartmentType) {
        this.appartmentType = appartmentType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Appartment() {
    }

    public Appartment(Integer apartmentId, Integer typeId, Integer attrId, String apartmentName,
            BigDecimal price, String address, Integer owner, AppartmentType appartmentType,
            Account account) {
        this.apartmentId = apartmentId;
        this.typeId = typeId;
        this.attrId = attrId;
        this.apartmentName = apartmentName;
        this.price = price;
        this.address = address;
        this.owner = owner;
        this.appartmentType = appartmentType;
        this.account = account;
    }

    @Override
    public String toString() {
        return "Appartment{" + "apartmentId=" + apartmentId + ", typeId=" + typeId + ", attrId="
                + attrId + ", apartmentName='" + apartmentName + '\'' + ", price=" + price
                + ", address='" + address + '\'' + ", owner=" + owner + ", appartmentType="
                + appartmentType + ", account=" + account + '}';
    }
}