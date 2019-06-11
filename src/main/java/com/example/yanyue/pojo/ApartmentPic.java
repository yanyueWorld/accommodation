package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName ApartmentPic
 * @Author yanyue
 * @Description 公寓图片实体类
 * @Date 9:32 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class ApartmentPic implements Serializable {

    private Integer apicId;// 公寓图片id
    private Integer apartmentId;// 公寓id
    private Integer picId;// 图片id

}