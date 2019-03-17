package com.javaPlus.java.standard;

// 当引入的静态类和静态常量被和本地方法和本地常量名字相同时,根据Java编译器的最短路径原则,如果能在本地找到变量,方法,类,就不会到其他类中查找
// 在实际编码的情况应该避免这种情况的发生

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class Proposal9 {

    public final static String PI = "祖冲之";

    public static int abs(int abs) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("PI=PI");
        System.out.println("abs(100)=" + abs(-100));
    }
}
