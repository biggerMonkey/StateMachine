package com.person.state.machine.collection.events;

import com.alibaba.fastjson.JSON;
import com.person.state.machine.collection.Event;
import com.person.state.machine.collection.exception.PayException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;


/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
@Service("payEvent")
@Slf4j
public class PayEvent implements Event {
    @Override
    public Boolean execute(String eventReqInfo) {
        PayReq payReq = JSON.parseObject(eventReqInfo, PayReq.class);
        log.info("支付操作请求入参：{}", JSON.toJSONString(payReq));
        Random random = new Random();
        int condition = random.nextInt(10) % 3;
        if (condition == 0) {
            throw new PayException("-1", "支付异常");
        }
        if (condition == 1) {
            log.info("支付异常");
            return false;
        }
        log.info("执行支付操作成功");
        return true;
    }
}
