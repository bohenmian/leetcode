package com.javaPlus.designpattern.observer;

/**
 * 具体的观察者
 */

public class HexaObserver extends Observer {

    //在构造方法中订阅主题
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        String result = Integer.toHexString(subject.getState()).toUpperCase();
        System.out.println("订阅的数据发生变化，新的数据处理为十六进制值为：" + result);
    }
}
