package com.algorithm.leetcode.array;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int number = nums[0];
        for (int i = 1; i < nums.length; i++) {
            number ^= nums[i];
        }
        return number;
    }
}
