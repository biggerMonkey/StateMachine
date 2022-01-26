package com.person.state.machine.collection;

import lombok.Data;

/**
 * @Author huangwenjun
 * @Date 2022/1/26
 * @Description 当前的状态，事件，下一个状态，触发的动作。
 **/
@Data
public class StateMachineTransaction {
    //当前的状态
    private State currentState;
    //事件
    private Action action;
    //下一个状态
    private State nextState;
    //触发的动作
    private String eventName;

    public StateMachineTransaction(Builder builder) {
        this.currentState = builder.getCurrentState();
        this.action = builder.getAction();
        this.nextState = builder.getNextState();
        this.eventName = builder.getEventName();
    }

    public static StateMachineTransaction.Builder builder() {
        return new StateMachineTransaction.Builder();
    }

    public static class Builder {
        //当前的状态
        private State currentState;
        //事件
        private Action action;
        //下一个状态
        private State nextState;
        //触发的动作
        private String eventName;

        public StateMachineTransaction build() {
            // 将builder对象传入到学生构造函数
            return new StateMachineTransaction(this);
        }

        public State getCurrentState() {
            return currentState;
        }

        public Builder setCurrentState(State currentState) {
            this.currentState = currentState;
            return this;
        }

        public Action getAction() {
            return action;
        }

        public Builder setAction(Action action) {
            this.action = action;
            return this;
        }

        public State getNextState() {
            return nextState;
        }

        public Builder setNextState(State nextState) {
            this.nextState = nextState;
            return this;
        }

        public String getEventName() {
            return eventName;
        }

        public Builder setEvent(String eventName) {
            this.eventName = eventName;
            return this;
        }
    }


}
