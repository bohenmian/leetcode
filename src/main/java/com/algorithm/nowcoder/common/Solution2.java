package com.algorithm.nowcoder.common;

/**
 * 不用+,-,*,/做加法
 * 例5+7=12(101+111), temp = 101 ^ 111 = 010 = 2, num2 = (101 & 111)<<1 = 10, num1 = 010
 * 5+7转变为10+2, temp = 1010 ^ 0010 = 1000, num2 = (1010 & 0010)<<1 = 0100, num1 = 1000
 * temp = 1000 ^ 0100 = 1100, num2 = (1000 & 0100) = 0000跳出循环
 */

public class Solution2 {

    public int Add(int num1,int num2) {
        //num2为两个数相加的进位,进位为0时跳出循环
        while(num2 != 0) {
            //temp为相加后的数减去进位
            int temp = num1 ^ num2;
            //求得进位
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }
}
