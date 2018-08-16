package com.javaPlus.java.proxy.jdk;

public class Main {

    public static void main(String[] args) {

        People target = (People) new ProxyHandler().getInstance(new Man());
        System.out.println(target.getClass());
        target.execute();

    }
}
