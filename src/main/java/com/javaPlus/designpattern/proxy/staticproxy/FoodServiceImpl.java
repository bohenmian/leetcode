package com.javaPlus.designpattern.proxy.staticproxy;

//委托类(被代理类)
public class FoodServiceImpl implements FoodService {

    @Override
    public Food makeChicken() {
        Food food = new Food();
        food.setChicken("1kg");
        food.setSpicy("1g");
        food.setSalt("5g");
        return food;
    }

    @Override
    public Food makeNoodle() {
        Food food = new Food();
        food.setNoodle("500g");
        food.setSalt("5g");
        return food;
    }
}
