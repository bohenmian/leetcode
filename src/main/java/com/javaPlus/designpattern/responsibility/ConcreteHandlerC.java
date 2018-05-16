package com.javaPlus.designpattern.responsibility;

/**
 * 当请求数在20~30之间时有权处理,否则转到下一处理器
 */

public class ConcreteHandlerC extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println(this.getClass() + "处理请求" + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
