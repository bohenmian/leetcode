package com.leetcode.array;


public class MaxProduct {

    public int maxProduct(int[] nums) {
        int max = 0;
        int secondMax = 0;
        for (int num : nums) {
            if (num >= max) {
                secondMax = max;
                max = num;
            } else if (num >= secondMax) {
                secondMax = num;
            }
        }
        return (max - 1) * (secondMax - 1);
    }
}
