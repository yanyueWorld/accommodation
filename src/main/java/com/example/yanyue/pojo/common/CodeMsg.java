package com.example.yanyue.pojo.common;

/**
 * @Author yanyue
 * @Description 消息码实体类
 * @Date 13:32 2019/3/25
 * @Version 1.0
 **/
public class CodeMsg {
    private int code;//状态消息码
    private String msg;//信息描述

    //通用异常
    public static CodeMsg SUCCESS = new CodeMsg(0,"success");
    public static CodeMsg SERVER_EXCEPTION = new CodeMsg(500100,"服务端异常");
    public static CodeMsg PARAMETER_ISNULL = new CodeMsg(500101,"输入参数为空");
    // 业务异常
    public static CodeMsg USER_NOT_EXSIST = new CodeMsg(500102,"用户不存在");
    public static CodeMsg ONLINE_USER_OVER = new CodeMsg(500103,"在线用户数超出允许登录的最大用户限制。");
    public static CodeMsg SESSION_NOT_EXSIST =  new CodeMsg(500104,"不存在离线session数据");
    public static CodeMsg NOT_FIND_DATA = new CodeMsg(500105,"查找不到对应数据");

    private CodeMsg(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
