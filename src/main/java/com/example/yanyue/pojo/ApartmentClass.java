package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName ApartmentClass
 * @Author yanyue
 * @Description 公寓类别实体类
 * @Date 9:31 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class ApartmentClass implements Serializable {
    private Integer classId;// 类别id
    private String className;// 类别名
}