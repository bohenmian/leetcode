package com.javaPlus.designpattern.observer;

/**
 * 适用场景: 当抽象模型有两个方面,其中一个方面依赖于另一个方面.
 * 当一个对象的改变需要同时改变其他对象或者当一个对象的改变必须通知其他对象
 */

public class ObserverPatternDemo {

    public static void main(String[] args) {

        //目标对象
        Subject subject = new Subject();

        //创建观察者的时候要传入观察的目标(注意传入的目标就是观察者订阅的主题)
        HexaObserver hexaObserver = new HexaObserver(subject);

        BinaryObserver binaryObserver = new BinaryObserver(subject);

        System.out.println("state change: 15");

        subject.setState(15);
    }
}
