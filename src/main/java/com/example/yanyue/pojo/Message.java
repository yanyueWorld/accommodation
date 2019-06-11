package com.example.yanyue.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
/**
 * @className message
 * @Author yanyue
 * @Description 评价实体类
 * @Date 9:59 2019/3/25
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class Message implements Serializable {

    private Integer messageId;//评价id
    private Integer accountId;//账户id
    private Integer replayId;//回复id
    private String serviceRank;//服务等级
    private String customerRank;//客户等级
    private String livingRank;//居住等级
    private String message;//留言
    private String type;//评价类型

}