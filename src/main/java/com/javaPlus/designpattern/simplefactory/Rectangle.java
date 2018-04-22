package com.javaPlus.designpattern.simplefactory;

//普通实现,需要具体实现就实现接口
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
