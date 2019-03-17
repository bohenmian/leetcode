package com.javaPlus.java.standard;

/**
 * 不要在常亮和变量中出现易混淆的字母
 * 包名全小写，类名首字母全大写，常量全部大写并用下划线隔开，变量采用驼峰命名法
 */

public class Proposal1 {

    public static void main(String[] args) {
        // 注意字母l和字母O不要与数字混用
        long i = 1l;
        System.out.println("i的两倍是："+ (i + i));
    }

}
