package com.javaPlus.designpattern.strategy;

/**
 * 策略的具体实现类
 */
public class GreenPen implements Strategy {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
