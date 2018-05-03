package com.algorithm.leetcode.common;

//1.判断负数和正数以及对应的不同的处理方式
//2.判断翻转后超过Integer的最大边界的处理方式
public class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        int temp = Math.abs(x);
        while (temp > 0) {
            result *= 10;
            result += temp % 10;
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
            temp /= 10;
        }
        return (int) (x > 0 ? result : -result);
    }
}
