package com.example.yanyue.pojo;

import java.io.Serializable;

/**
 * @ClassName AttrVal
 * @Author yanyue
 * @Description 属性值表
 * @Date 9:51 2019/3/25
 * @Version 1.0
 **/
public class AttrVal implements Serializable {

    private Integer attrValueId;// 属性值id
    private Integer attrId;// 属性id
    private String arrtValue;// 属性值
    private Integer apartmentId;// 公寓id

    public Integer getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(Integer attrValueId) {
        this.attrValueId = attrValueId;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getArrtValue() {
        return arrtValue;
    }

    public void setArrtValue(String arrtValue) {
        this.arrtValue = arrtValue;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public AttrVal() {
    }

    public AttrVal(Integer attrValueId, Integer attrId, String arrtValue, Integer apartmentId) {
        this.attrValueId = attrValueId;
        this.attrId = attrId;
        this.arrtValue = arrtValue;
        this.apartmentId = apartmentId;
    }

    @Override
    public String toString() {
        return "AttrVal{" + "attrValueId=" + attrValueId + ", attrId=" + attrId + ", arrtValue='"
                + arrtValue + '\'' + ", apartmentId=" + apartmentId + '}';
    }
}