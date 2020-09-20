package com.leetcode.array;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 1; i <= nums.length; i++) {
            result = result ^ i ^ nums[i - 1];
        }
        return result;
    }

    public int missingNumberInOtherWay(int[] nums) {
        int size = nums.length;
        int sum = size * (size + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
