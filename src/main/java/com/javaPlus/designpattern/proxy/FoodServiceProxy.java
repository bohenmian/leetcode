package com.javaPlus.designpattern.proxy;

/**
 * 代理类,一般静态代理时,代理类和委托类要实现一个共同的接口或者继承一个类
 * 使用场景: 主要用于做类的访问控制
 */
public class FoodServiceProxy implements FoodService {

    private FoodService foodService = new FoodServiceImpl();

    //代理类不实现具体逻辑,代理类中具体逻辑仍然是用被代理类来实现
    @Override
    public Food makeChicken() {
        Food food = foodService.makeChicken();
        return food;
    }

    @Override
    public Food makeNoodle() {
        Food food = foodService.makeNoodle();
        return food;
    }
}
