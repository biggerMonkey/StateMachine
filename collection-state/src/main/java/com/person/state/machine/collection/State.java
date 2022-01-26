package com.person.state.machine.collection;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
public enum State {
    WAIT_PAY(1, "待付款"),
    WAIT_SEND(2, "待发货"),
    ALREAD_PAID(10, "已发货-待收货"),
    COMPLETE(20, "完成"),
    CANCEL(-1, "取消"),
    LOCK(-10, "锁定");
    private Integer code;
    private String msg;

    State(Integer code, String msg) {
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
