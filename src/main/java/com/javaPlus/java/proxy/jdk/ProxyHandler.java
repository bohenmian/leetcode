package com.javaPlus.java.proxy.jdk;

import java.lang.reflect.Method;

public class ProxyHandler implements MyInvocationHandler {

    private People target = null;

    public Object getInstance(People target) {
        this.target = target;
        Class clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("外卖小哥去送外卖");
        method.invoke(target, args);
        System.out.println("送外卖完成");
        return null;
    }
}
