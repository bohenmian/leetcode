package com.javaPlus.designpattern.proxy;

public class Main {

    public static void main(String[] args) {

        People target = (People) new ProxyHandler().getInstance(new Man());
        target.execute();
    }
}
