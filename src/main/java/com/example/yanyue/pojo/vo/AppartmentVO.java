package com.example.yanyue.pojo.vo;

import java.math.BigDecimal;

/**
 * @ClassName AppartmentVO
 * @Description 公寓视图对象2
 * @Author yanyue
 * @Date 2019/3/27 10:56
 * @Version 1.0
 **/
public class AppartmentVO {
    private Integer apartmentId;//公寓id
    private String typeName;//类型id
    private String apartmentName;//公寓名
    private BigDecimal price;//单价
    private String address;//地址
    private String name;//所有者

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppartmentVO() {
    }

    public AppartmentVO(Integer apartmentId, String typeName, String apartmentName, BigDecimal price, String address, String name) {
        this.apartmentId = apartmentId;
        this.typeName = typeName;
        this.apartmentName = apartmentName;
        this.price = price;
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return "AppartmentVO{" + "apartmentId=" + apartmentId + ", typeName='" + typeName + '\'' + ", apartmentName='" + apartmentName + '\'' + ", price=" + price + ", address='" + address + '\'' + ", name='" + name + '\'' + '}';
    }
}
