package com.person.state.machine.collection.events;


import com.person.state.machine.collection.State;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
public class CommonReq {

    private Long orderId;

    private String operatorBy;

    private State nextState;
}
