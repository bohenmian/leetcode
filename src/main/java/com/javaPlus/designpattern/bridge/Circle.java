package com.javaPlus.designpattern.bridge;

//修正抽象化角色
//桥梁模式的好处: 方法的具体实现对客户端透明.抽象角色和具体实现可以独立变化,耦合度低
//抽象化角色和实现化角色构成了桥梁.修正化抽象化角色的具体实现可以根据自己的需求动态的加入实现化角色的具体实现
public class Circle extends Shape {

    private int radius;

    public Circle(DrawAPI drawAPI, int radius) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(radius, 0, 0);
    }
}
