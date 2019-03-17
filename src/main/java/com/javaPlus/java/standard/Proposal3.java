package com.javaPlus.java.standard;

/**
 * 三元操作符类型必须一致
 */

public class Proposal3 {

    public static void main(String[] args) {

        int i = 80;
        // 当三元操作符的第一个操作数和第二个操作数类型相同时返回的类型确定，所以该条语句的返回值是90
        String s = String.valueOf(i < 100 ? 90 : 100);

        // 当三元操作符的第一个操作数和第二个操作数类型不相同时会对相应的类型做转换，这里会将int类型转换为float类型，所以返回值是90.0
        String s1 = String.valueOf(i < 100 ? 90 : 100.0);

        // s.equals(s1)会返回false
        System.out.println("两者是否相等:" + s.equals(s1));

    }
}
