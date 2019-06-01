package com.example.yanyue.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class ReportVO {
    private Integer year;
    private Integer month;
    private BigDecimal sum;

}
