package com.example.yanyue.pojo;

import lombok.ToString;

import java.io.Serializable;
/**
 * @className message
 * @Author yanyue
 * @Description 评价实体类
 * @Date 9:59 2019/3/25
 * @Version 1.0
 **/
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

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getReplayId() {
        return replayId;
    }

    public void setReplayId(Integer replayId) {
        this.replayId = replayId;
    }

    public String getServiceRank() {
        return serviceRank;
    }

    public void setServiceRank(String serviceRank) {
        this.serviceRank = serviceRank;
    }

    public String getCustomerRank() {
        return customerRank;
    }

    public void setCustomerRank(String customerRank) {
        this.customerRank = customerRank;
    }

    public String getLivingRank() {
        return livingRank;
    }

    public void setLivingRank(String livingRank) {
        this.livingRank = livingRank;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}