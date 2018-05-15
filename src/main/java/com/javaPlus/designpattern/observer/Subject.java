package com.javaPlus.designpattern.observer;

/**
 * 目标: 众多观察者观察的对象(目标或主题)
 */

import java.util.ArrayList;
import java.util.List;

public class Subject {

    //观察者列表
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //状态发生改变,通知每个观察者
        notifyAllObservers();
    }

    //订阅方法(将Observer加入到观察者列表中)
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //当Subject的状态发生改变,通知观察者列表的每一个观察者
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
