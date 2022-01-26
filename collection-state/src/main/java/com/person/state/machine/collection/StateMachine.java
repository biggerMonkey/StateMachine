package com.person.state.machine.collection;

import com.person.state.machine.collection.exception.InvalidActionException;
import com.person.state.machine.common.BeanUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description
 **/
@Component
public class StateMachine {

    @Resource
    private BeanUtil beanUtil;

    private List<StateMachineTransaction> stateMachineTransactionList = Arrays.asList(
            StateMachineTransaction.builder()
                    .setCurrentState(State.WAIT_PAY)
                    .setAction(Action.PAY)
                    .setNextState(State.WAIT_SEND)
                    .setEvent("payEvent")
                    .build()
    );

    public void addStateMachineTransaction(StateMachineTransaction stateMachineTransaction) {
        this.stateMachineTransactionList.add(stateMachineTransaction);
    }

    public String execute(Action action, Long orderId, String eventReqInfo) {
        //查询当前订单状态
        State state = State.WAIT_PAY;
        //判断当前状态是否可以执行 action
        Optional<StateMachineTransaction> transactionOptional = stateMachineTransactionList
                .stream()
                .filter(transaction ->
                        transaction.getAction().equals(action) && transaction.getCurrentState().equals(state))
                .findFirst();

        if (!transactionOptional.isPresent()) {
            throw new InvalidActionException("1", "无效操作！");
        }

        StateMachineTransaction transaction = transactionOptional.get();
        //查找动作实现类
        Event event = beanUtil.getBeanByName(transaction.getEventName());
        //执行触发的动作 不包含修改下一个状态
        Boolean result = event.execute(eventReqInfo);
        //判断执行结果
        if (result) {
            //设置下一个状态
            //setState(transaction.getNextState());
        }
        return "";
    }

}
