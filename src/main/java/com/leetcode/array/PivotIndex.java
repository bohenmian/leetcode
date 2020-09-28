package com.leetcode.array;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for (int value : nums) rightSum += value;
        for (int i = 0; i < nums.length; i++) {
            if (rightSum - nums[i] == leftSum) return i;
            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return -1;
    }
}
