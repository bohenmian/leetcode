package com.leetcode.array;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            result = result > 0 ? result + num : num;
            max = Math.max(max, result);
        }
        return max;
    }
}
