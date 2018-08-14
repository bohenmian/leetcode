package com.javaPlus.designpattern.proxy.jdkproxy;

public class Man implements People {

    @Override
    public void execute() {
        System.out.println("拿外卖");
    }
}
