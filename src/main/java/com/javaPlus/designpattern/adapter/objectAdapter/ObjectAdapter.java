package com.javaPlus.designpattern.adapter.objectAdapter;

public class ObjectAdapter {

    public static void main(String[] args) {

        //创建一个鸡对象
        Cock cock = new WildCock();

        //将鸡对象适配为鸭对象
        Duck duck = new CockAdapter(cock);
    }
}
