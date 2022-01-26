package com.person.state.machine.collection;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
public enum  Action {
    PAY(1, "付款"),
    SEND(2, "发货"),
    COMPLETE(20, "完成"),
    CANCEL(-1, "取消"),
    LOCK(-10, "锁定");
    private Integer code;
    private String msg;

    Action(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
