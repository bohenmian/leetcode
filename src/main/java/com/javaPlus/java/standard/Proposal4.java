package com.javaPlus.java.standard;

/**
 * 避免带有变长参数的方法重载
 */

import java.text.NumberFormat;

public class Proposal4 {

    public void calPrice(int price, int discount) {
        float knockdownPrice = price * discount / 100.0F;
        System.out.println("简单折扣后的价格是：" + formateCurrency(knockdownPrice));
    }

    public void calPrice(int price, int... discounts) {
        float knockdownPrice = price;
        for (int discount : discounts) {
            knockdownPrice = knockdownPrice * discount / 10;
        }
        System.out.println("复杂折扣后的价格是：" + formateCurrency(knockdownPrice));
    }


    private String formateCurrency(float price) {
        return NumberFormat.getCurrencyInstance().format(price / 100);
    }

    public static void main(String[] args) {

        Proposal4 proposal4 = new Proposal4();

        // 第二个形参可以编译成int类型也可以编译成int[]数组，所以不建议写这种机器可以看懂但是让人疑惑的程序
        // JVM在编译时会"偷懒"，所以会从简单的开始编译，只要符合编译条件就可以编译
        proposal4.calPrice(49900, 75);
    }
}
