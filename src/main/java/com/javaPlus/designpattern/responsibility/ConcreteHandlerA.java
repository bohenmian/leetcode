package com.javaPlus.designpattern.responsibility;

/**
 * 当请求数在0~10之间有权处理,否则转到下一位
 */

public class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass() + "处理请求" + request);
        } else if (this.getSuccessor() != null) {   //获取handleA的下一个处理器
            successor.handleRequest(request);
        }
    }
}
