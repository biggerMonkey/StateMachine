package com.person.state.machine.collection.events;

import lombok.Data;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
@Data
public class PayReq extends CommonReq {
    private String payAccount;
}
