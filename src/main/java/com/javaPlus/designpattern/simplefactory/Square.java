package com.javaPlus.designpattern.simplefactory;

//普通实现,实现一个类就实现它的接口.这种方式冗余太大
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
