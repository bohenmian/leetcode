package com.javaPlus.designpattern.strategy;


/**
 * 环境类,维护了一个对Strategy的引用
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeDraw(int radius, int x, int y) {
        strategy.draw(radius, x, y);
    }

}
