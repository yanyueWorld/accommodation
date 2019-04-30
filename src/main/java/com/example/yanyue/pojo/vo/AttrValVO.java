package com.example.yanyue.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class AttrValVO implements Serializable {
    private Integer valId;
    private String valueName;
    private Integer attrId;
}
