package com.javaPlus.designpattern.simplefactory;

//通过ShapeFactory来获取Shape对象,避免冗余,隔离和客户和商品创建之间的联系
public class ShapeFactory {

    public Shape ShapeFactory(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        //单一职责原则,一个类只提供一种功能
        if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
