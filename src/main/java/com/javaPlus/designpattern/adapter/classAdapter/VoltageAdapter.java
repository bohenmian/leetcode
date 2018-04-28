package com.javaPlus.designpattern.adapter.classAdapter;

//提供给外界适配器使用,类适配器是通过继承源类和实现需要的类来适配
public class VoltageAdapter extends Voltage220 implements Voltage5 {

    //实现220V向5V的转换
    @Override
    public int output5V() {
        int source = super.output220V(); //调用父类方法,获得220V电压

        int result = source / 44; //实现220V -> 5V

        return result;
    }
}
