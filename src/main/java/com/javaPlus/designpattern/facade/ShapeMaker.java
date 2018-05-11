package com.javaPlus.designpattern.facade;

/**
 * 提供一个门面类
 */
public class ShapeMaker {

    private Shape rectangle;

    private Shape square;

    public ShapeMaker() {

        rectangle = new Rectangle();

        square = new Square();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
