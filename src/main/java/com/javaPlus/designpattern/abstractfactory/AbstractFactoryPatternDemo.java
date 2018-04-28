package com.javaPlus.designpattern.abstractfactory;

/**
 * 抽象工厂模式的好处:隔离了具体类的实现,使客户并不知道什么被创建.
 * 产品族中的多个对象被设计成一起工作时,保证客户端智使用一个产品族中的对象(Shape和Color)
 * 符合开闭原则,利于扩展,无需修改现有的系统
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //获取Shape的工厂
        AbstractFactory abstractFactory = FactoryProducer.getFactory("SHAPE");
        //通过需求去获得具体的工厂
        //获取形状为Square的对象
        abstractFactory.getShape("SQUARE");

    }
}
