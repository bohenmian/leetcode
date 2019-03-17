package com.javaPlus.java.standard;

// 静态导入应该遵循以下原则
// 1.不使用*通配符,除非导入的都是静态常量类 2.方法具有明确意义
// 下面这个例子就是一个反例,导入的静态方法不知道来自于哪个包,哪个类,在实际代码中应该避免,虽然可以通过IDE查找

import java.text.NumberFormat;

import static java.lang.Math.*;
import static java.lang.Double.*;
import static java.lang.Integer.*;
import static java.text.NumberFormat.*;

public class Proposal8 {

    public static void main(String[] args) {
        double s = PI * parseDouble(args[0]);
        NumberFormat numberFormat = getInstance();
        numberFormat.setMaximumFractionDigits(parseInt(args[1]));
        formatMessage(numberFormat.format(s));
    }

    public static void formatMessage(String s) {
        System.out.println("圆面积是:" + s);
    }
}
