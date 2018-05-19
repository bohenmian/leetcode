package com.algorithm.leetcode.array;

/**
 * 求数组中个数超过n/2的元素
 */

public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int n = 0;
        int majorElement = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (majorElement == nums[i]) {
                n++;
            } else {
                n--;
            }
            if (n <= 0) {
                majorElement = nums[i + 1];
            }
        }
        return majorElement;
    }
}
