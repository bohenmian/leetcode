package com.javaPlus.designpattern.observer;


/**
 * 观察者的抽象: 定义了观察者中的通用方法(通知)
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
