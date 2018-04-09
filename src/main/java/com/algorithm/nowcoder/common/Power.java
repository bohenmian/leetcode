package com.algorithm.nowcoder.common;

/**
 * question
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 */

public class Power {
    public double Power(double base, int exponent) {
        double sum = 1.0;
        if (exponent == 0) {
            return 1.000000;
        }
        if (base > -0.000001 && base < 0.000001) {
            return 0;
        }
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                sum = sum * base;
            }
        } else {
            exponent = -exponent;
            for (int i = 0; i < exponent; i++) {
                sum = sum * base;
            }
            sum = 1.0 / sum;
        }
        return sum;

        //另解,数学公式
//        if (exponent == 0) {
//            return 1;
//        }
//        if (exponent == 1) {
//            return base;
//        }
//        double result = Power(base, exponent >> 1);
//        result *= result;
//        if ((exponent & 1) == 1) {
//            result *= base;
//        }
//        return result;
    }
}
