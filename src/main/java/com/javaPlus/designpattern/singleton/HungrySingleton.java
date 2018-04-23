package com.javaPlus.designpattern.singleton;

/**
 * 饿汉模式: 直接在类加载阶段初始化变量
 */

public class HungrySingleton {

    //在类的加载阶段就初始化
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //构造方法初始化,避免类直接被外部变量直接创建
    private HungrySingleton() {

    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
