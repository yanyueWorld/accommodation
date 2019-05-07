package com.example.yanyue.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class MessageVO implements Serializable {
    private String accountName;//账户名
    private Integer messageId;//评价id
    private Integer accountId;//账户id
    private String serviceRank;//服务等级
    private String customerRank;//客户等级
    private String livingRank;//居住等级
    private String message;//留言
    private String type;//评价类型
}
