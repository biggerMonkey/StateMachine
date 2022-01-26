package com.person.state.machine.collection.exception;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
public class InvalidActionException extends BaseException {

    public InvalidActionException(String errorCode, String message) {
        super(errorCode, message);
    }

    public InvalidActionException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
