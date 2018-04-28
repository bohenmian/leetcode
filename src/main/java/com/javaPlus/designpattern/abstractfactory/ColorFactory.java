package com.javaPlus.designpattern.abstractfactory;

//抽象工厂的具体实现
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        } else if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
