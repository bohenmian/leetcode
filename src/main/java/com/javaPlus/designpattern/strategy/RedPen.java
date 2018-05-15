package com.javaPlus.designpattern.strategy;

/**
 * 具体的策略实现类
 */
public class RedPen implements Strategy {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
