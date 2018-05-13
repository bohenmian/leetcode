package com.algorithm.leetcode.array;

/**
 * 将一个数加一
 */

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        int carry = 1;
        int length = digits.length - 1;
        while (length >= 0) {
            int number = (digits[length] + carry) % 10;     //计算加1后这一位的值
            carry = (digits[length] + carry) / 10;  //计算加1后的进位
            digits[length] = number;
            if (carry == 0) {   //如果进位为0,那么就可以直接返回了
                return digits;
            }
            length--;
        }
        //这是在最高位有进位的情况
        int[] digitsResult = new int[digits.length + 1];
        digitsResult[0] = 1;    //最高位进位的情况,进位后的从第二位开始一定为0
        for (int i = 1; i < digitsResult.length; i++) {
            digitsResult[i] = 0;
        }
        return digitsResult;
    }
}
