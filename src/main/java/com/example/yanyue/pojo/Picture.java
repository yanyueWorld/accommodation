package com.example.yanyue.pojo;

import lombok.ToString;

import java.io.Serializable;
/**
 * @Classname Picture
 * @Author yanyue
 * @Description 图片实体类
 * @Date 10:11 2019/3/25
 * @Version 1.0
 **/
@ToString
public class Picture implements Serializable {

    private Integer picId;//图片id
    private String picName;//图片名
    private String picAddr;//图片路径

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPicAddr() {
        return picAddr;
    }

    public void setPicAddr(String picAddr) {
        this.picAddr = picAddr;
    }
}