package com.example.yanyue.pojo;

import java.io.Serializable;

/**
 * @ClassName AppartmentType
 * @Author 严悦
 * @Description 公寓类别表
 * @Date 9:45 2019/3/25
 * @Version 1.0
 **/
public class AppartmentType implements Serializable {

    private Integer typeId;// 类别id
    private String typeName;// 类别名

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }



    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public AppartmentType() {
    }

    public AppartmentType(Integer typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "AppartmentType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}