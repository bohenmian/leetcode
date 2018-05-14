package com.algorithm.leetcode.common;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;       //初始值
        } else if (n == 2) {
            return 2;       //初始值
        }
        int number1 = 1;
        int number2 = 2;
        int number = 0;
        for (int i = 3; i <= n; i++) {
            number = number1 + number2;     //可以采用递归算法,但是递归速度太慢,达不到事件要求,需要优化
            if (number1 < number2) {
                number1 = number;       //因为递归算法采用的是前面两项想加,所以为了避免再次计算前面两项的值,每次记录前面两项的值,并且将其中较小的一项换为这一次相加的值,便于下一次计算
            } else {
                number2 = number;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}
