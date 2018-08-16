package com.javaPlus.designpattern.proxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        People target = (People) new ProxyHandler().getInstance(new Man());

        System.out.println(target.getClass().getName());

        target.execute();


        //生成代理对象的字节码
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{People.class});

        //将字节码对象转换为class文件,在生成的class文件中我们可以看到静态代理块动态的加载了execute以及代理对象父类Object的方法
        //同时会有一个final execute(其中调用super.h.invoke即调用InvocationHandler的invoke方法,但是因为ProxyHandler实现了该方法,实际是调用子类的invoke方法)
        FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();

    }
}
