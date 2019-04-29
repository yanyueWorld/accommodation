package com.example.yanyue.pojo.dto;

import com.example.yanyue.pojo.ApartmentAttr;
import com.example.yanyue.pojo.ApartmentClass;
import com.example.yanyue.pojo.AppartmentType;
import com.example.yanyue.pojo.Value;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class AppartmentDTO implements Serializable {
    private String appartmentName;
    private AppartmentType appartmentType;
    private Value value;
    private ApartmentAttr apartmentAttr;
    private ApartmentClass apartmentClass;
    private String address;
    private BigDecimal price;
}
