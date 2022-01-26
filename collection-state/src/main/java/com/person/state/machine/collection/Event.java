package com.person.state.machine.collection;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
public interface Event {
    Boolean execute(String eventReqInfo);
}
