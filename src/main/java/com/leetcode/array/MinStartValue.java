package com.leetcode.array;

public class MinStartValue {

    public int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int value : nums) {
            sum += value;
            if (sum < minSum) minSum = sum;
        }
        return minSum > 0 ? 1 : -minSum + 1;
    }
}
