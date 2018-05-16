package com.javaPlus.designpattern.responsibility;

/**
 * 当请求数在0~10之间有权处理,否则转到下一位
 */

public class ConcreteHandlerB extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass() + "处理请求" + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }

    }
}
