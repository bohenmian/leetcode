package com.leetcode.array;

/**
 * nums全为正数,最大的三个正数相乘
 * nums全为负数,最大的三个负数相乘
 * nums只有一个负数,最大的三个数相乘
 * nums只有一个正数,最小的两个负数乘正数
 * nums两个负数,最大的三个数相乘
 * nums两个正数,最小的两个负数乘正数
 */

public class MaximumProduct {

    public int maximumProduct(int[] nums) {
        int max1 = -1001, max2 = -1001, max3 = -1001;
        int min1 = 1001, min2 = 1001;
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3){
                max3 = num;
            }
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}
