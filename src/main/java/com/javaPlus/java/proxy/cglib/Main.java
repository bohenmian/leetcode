package com.javaPlus.java.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Main {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        // 生成的代理类继承被代理类,作为被代理类的子类
        enhancer.setSuperclass(HelloServiceImpl.class);
        // 设置回调
        enhancer.setCallback(new HelloMethodInterceptor());
        // 生成代理类
        HelloServiceImpl helloService = (HelloServiceImpl) enhancer.create();
        helloService.sayHello();
    }
}
