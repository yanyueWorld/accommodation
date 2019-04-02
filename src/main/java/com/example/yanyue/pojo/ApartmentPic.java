package com.example.yanyue.pojo;

import java.io.Serializable;

/**
 * @ClassName ApartmentPic
 * @Author yanyue
 * @Description 公寓图片实体类
 * @Date 9:32 2019/3/25
 * @Version 1.0
 **/
public class ApartmentPic implements Serializable {

    private Integer apicId;// 公寓图片id
    private Integer apartmentId;// 公寓id
    private Integer picId;// 图片id

    public Integer getApicId() {
        return apicId;
    }

    public void setApicId(Integer apicId) {
        this.apicId = apicId;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public ApartmentPic() {
    }

    public ApartmentPic(Integer apicId, Integer apartmentId, Integer picId) {
        this.apicId = apicId;
        this.apartmentId = apartmentId;
        this.picId = picId;
    }

    @Override
    public String toString() {
        return "ApartmentPic{" + "apicId=" + apicId + ", apartmentId=" + apartmentId + ", picId="
                + picId + '}';
    }
}