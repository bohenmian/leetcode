package com.javaPlus.designpattern.abstractfactory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
