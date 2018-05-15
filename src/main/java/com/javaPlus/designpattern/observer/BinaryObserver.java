package com.javaPlus.designpattern.observer;

/**
 * 具体的观察者
 */

public class BinaryObserver extends Observer {

    //在构造方法中订阅主题(将Observer和Subject联系起来)
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        String result = Integer.toBinaryString(subject.getState());
        System.out.println("订阅的数据发生变化，新的数据处理为二进制值为：" + result);
    }
}
