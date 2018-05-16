package com.javaPlus.designpattern.responsibility;

/**
 * 责任链模式为请求创建了一个接受者对象的链,这种模式给予请求的类型,对请求的发送者和接受者进行解耦
 * 应用场景: 在不明确指定接受者的情况下,向对个对象中的一个提交一个请求(Spring Security的拦截器链有点类似于责任链模式,但是责任链模式中一个请求只能被一个对象锁处理)
 * 而Spring Security的一个请求可以被多个拦截器所处理
 * 责任链模式是定义好一个链表,按照链表的流程传递下去
 */

public class ResponsibilityDemo {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        int[] requests = {2, 5, 14, 22, 18, 27, 20};
        for (int request : requests) {
            handlerA.handleRequest(request);
        }
    }
}
