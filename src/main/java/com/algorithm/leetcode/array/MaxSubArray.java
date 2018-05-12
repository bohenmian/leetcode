package com.algorithm.leetcode.array;

/**
 * 去数组中连续的最大值
 * 1.如果一个数小于0,那么加上这个会更加小,所以如果前面前面想加的数小于０,直接丢弃
 * 2.用一个max来记录数组的连续最大值
 */

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentSum = nums[0];
        if (nums == null || nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            currentSum = currentSum < 0 ? nums[i] : currentSum + nums[i];
            max = (currentSum > max) ? currentSum : max;
        }
        return max;
    }
}
