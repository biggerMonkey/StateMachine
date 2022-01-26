package com.person.state.machine.collection.exception;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
public class PayException extends BaseException {

    public PayException(String errorCode, String message) {
        super(errorCode, message);
    }

    public PayException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
