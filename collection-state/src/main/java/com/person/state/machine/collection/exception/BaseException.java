package com.person.state.machine.collection.exception;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
public class BaseException extends RuntimeException {
    /**
     * 错误码
     */
    private final String errorCode;
    /**
     * 公共构造函数
     *
     * @param errorCode 错误码
     * @param message   消息
     */
    public BaseException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * 公共工造函数
     *
     * @param errorCode 错误码
     * @param message   错误消息
     * @param cause     原因
     */
    public BaseException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
