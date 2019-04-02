package com.example.yanyue.pojo.common;
/**
 * @Author yanyue
 * @Description 结果处理实体类
 * @Date 13:34 2019/3/25
 * @Version 1.0
 **/
public class Result<T> {
    private String msg;//消息
    private int code;//状态码
    private Long count;//结果集长度
    private T data;//结果集

    private Result(T data){
        this.code = 0;
        this.msg = "成功";
        this.data = data;
    }

    private Result(CodeMsg codeMsg){
        if(codeMsg==null){
            return ;
        }
        this.code=codeMsg.getCode();
        this.msg=codeMsg.getMsg();
    }

    public static<T> Result<T> success(T data){
        return new Result<T>(data);
    }

    public static<T> Result<T> success(){
        return (Result<T>) success("");
    }

    public static<T> Result<T> error(CodeMsg codeMsg,String msg){
        codeMsg.setMsg(codeMsg.getMsg()+"---"+msg);
        return new Result<T>(codeMsg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Result{" + "msg='" + msg + '\'' + ", code=" + code + ", count=" + count + ", data=" + data + '}';
    }
}
