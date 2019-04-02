package com.example.yanyue.pojo;

import java.io.Serializable;

/**
 * @ClassName AppartmentAttr
 * @Author yanyue
 * @Description 公寓属性实体类
 * @Date 9:30 2019/3/25
 * @Version 1.0
 **/
public class ApartmentAttr implements Serializable {
    private Integer attrId;// 属性id
    private String attrName;// 属性名
    private Integer classId;// 类别id

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public ApartmentAttr() {
    }

    public ApartmentAttr(Integer attrId, String attrName, Integer classId) {
        this.attrId = attrId;
        this.attrName = attrName;
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "ApartmentAttr{" + "attrId=" + attrId + ", attrName='" + attrName + '\''
                + ", classId=" + classId + '}';
    }
}