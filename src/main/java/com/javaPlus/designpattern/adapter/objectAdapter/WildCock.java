package com.javaPlus.designpattern.adapter.objectAdapter;

public class WildCock implements Cock {

    @Override
    public void gobble() {
        System.out.println("咕咕叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡也会飞哦");
    }
}
