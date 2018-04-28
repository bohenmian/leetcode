package com.javaPlus.designpattern.bridge;

//具体实现化角色
public class RedPen implements DrawAPI {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
