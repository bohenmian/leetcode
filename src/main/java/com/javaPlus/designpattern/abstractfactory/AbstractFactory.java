package com.javaPlus.designpattern.abstractfactory;

//适用于一个产品有多个产品簇,如果不利用抽象工厂,每个具体实现都要实现这两个接口才能实现具体的方法
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
