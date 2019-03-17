package com.javaPlus.java.standard;

import java.util.Random;

public interface Const {

    // 常量在编译期就应该确定其值，不应该在运行期间更改
    public static final int RAND_CONST = new Random().nextInt();
}
