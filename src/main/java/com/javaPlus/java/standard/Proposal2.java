package com.javaPlus.java.standard;

/**
 * 不要让常量蜕变为变量
 */

public class Proposal2 {

    public static void main(String[] args) {
        // 这里引用的常量本身使用了一个随机数生成算法，所以在运行期会改变
        System.out.println("常量会变哟：" + Const.RAND_CONST);
    }

}
