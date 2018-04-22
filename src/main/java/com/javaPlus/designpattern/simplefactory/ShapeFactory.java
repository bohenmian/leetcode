package com.javaPlus.designpattern.simplefactory;

//通过ShapeFactory来获取Shape对象,避免冗余
public class ShapeFactory {

    public Shape ShapeFactory(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
