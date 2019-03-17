package com.javaPlus.java.standard;

public class Proposal7 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            // Java中这里的count值一直为0,最终打印出的值也为0
            // Java中i++和++i都会赋值给临时变量,最终运算使用的也是临时变量
            count = count++;    //这里使用++count就会自增
//            count = count++等价于
//            public static int mockAdd (int count) {
//                int temp = count;
//                count = count + 1;
//                return temp
//            }
        }

        System.out.println(count);
    }
}
