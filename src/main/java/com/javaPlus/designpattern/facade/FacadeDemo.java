package com.javaPlus.designpattern.facade;

/**
 * 外观模式的好处: 屏蔽调用子系统组件,让客户端看不到系统的具体实现,降低了客户端和子系统之间的耦合
 */

public class FacadeDemo {

    public static void main(String[] args) {
        //创建一个圆
        Square square = new Square();
        square.draw();

        //创建一个长方形
        Rectangle rectangle = new Rectangle();
        rectangle.draw();


        //通过外观类来访问,简化客户端与之的接口
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawRectangle();


    }
}
