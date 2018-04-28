package com.javaPlus.designpattern.adapter.objectAdapter;


//Adapter适配器提供给外界使用
public class CockAdapter implements Duck {

    private Cock cock;

    //将鸡适配为鸭
    public CockAdapter(Cock cock) {
        this.cock = cock;
    }


    @Override
    public void quack() {
        cock.gobble(); //内部其实是鸡的实现
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
