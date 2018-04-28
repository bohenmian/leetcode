package com.javaPlus.designpattern.abstractfactory;

//提供一个给外界获取工厂的方法
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (type.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
