package com.javaPlus.java.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Before:" + method.getName());
        Object object = proxy.invokeSuper(obj, args);
        System.out.println("After:" + method.getName());
        return object;
    }
}
