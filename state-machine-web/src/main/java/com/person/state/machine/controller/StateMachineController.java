package com.person.state.machine.controller;

import com.person.state.machine.collection.Action;
import com.person.state.machine.collection.StateMachine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
@RestController
@RequestMapping("/state/machine")
public class StateMachineController {

    @Resource
    private StateMachine stateMachine;

    @RequestMapping("/order/pay")
    public String pay() {
        stateMachine.execute(Action.PAY,1L,"");
        return "complete success";
    }


    @RequestMapping("/order/complete")
    public String completeOrder() {
        return "complete success";
    }


}
