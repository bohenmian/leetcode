package com.javaPlus.designpattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {

    private People target;

    //获取代理对象
    public Object getInstance(People target) {
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("外卖小哥去送外卖");
        method.invoke(target, args);
        System.out.println("送外卖完成");
        return null;
    }
}
