package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName AppartmentAttr
 * @Author yanyue
 * @Description 公寓属性实体类
 * @Date 9:30 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class ApartmentAttr implements Serializable {
    private Integer attrId;// 属性id
    private String attrName;// 属性名
    private Integer classId;// 类别id
    private ApartmentClass apartmentClass;


}