package com.javaPlus.designpattern.singleton;

/**
 * 懒汉模式: 实例在运行时才进行实例化,所以加载阶段比较快,运行阶段比较慢
 * 饿汉模式: 实例在加载阶段就进行实例化,所以运行阶段比较快,加载阶段比较慢
 */

public class LazySingleton {

//    private static LazySingleton lazySingleton;
//
//    private LazySingleton() {
//    }
//
//    public static LazySingleton getLazySingleton() {
//        if (lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    //声明类的唯一实例,线程安全
    private static LazySingleton lazySingleton;

    //构造函数私有化,防止外部直接初始化
    private LazySingleton() {
    }

    //提供一个获取实例的方法,使用synchronized保证线程的安全
    public static synchronized LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //使用volatile保证变量的可见性,Double Check
    private volatile static LazySingleton instance;

    public static LazySingleton getInstance() {
        //检查实例是否存在,如果不存在再进入下列同步块
        if (instance == null) {
            synchronized (LazySingleton.class) {
                //再次检查实例是否存在,如果不存在才真正的创建实例
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
