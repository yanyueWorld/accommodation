package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class AttrValAppartment implements Serializable {
    private Integer attrValAppartmentId;
    private Integer attrValId;
    private Integer appartmentId;

    public AttrValAppartment() {
    }
}
