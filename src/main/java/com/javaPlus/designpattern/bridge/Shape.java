package com.javaPlus.designpattern.bridge;

/**
 * 抽象化角色
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    //抽象方法,具体实现留给修正抽象化角色实现
    public abstract void draw();
}
