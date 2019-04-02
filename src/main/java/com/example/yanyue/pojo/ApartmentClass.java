package com.example.yanyue.pojo;

import java.io.Serializable;

/**
 * @ClassName ApartmentClass
 * @Author yanyue
 * @Description 公寓类别实体类
 * @Date 9:31 2019/3/25
 * @Version 1.0
 **/
public class ApartmentClass implements Serializable {
    private Integer classId;// 类别id
    private String className;// 类别名

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ApartmentClass() {
    }

    @Override
    public String toString() {
        return "ApartmentClass{" + "classId=" + classId + ", className='" + className + '\'' + '}';
    }

    public ApartmentClass(Integer classId, String className) {
        this.classId = classId;
        this.className = className;
    }
}