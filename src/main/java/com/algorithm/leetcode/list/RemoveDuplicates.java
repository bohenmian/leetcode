package com.algorithm.leetcode.list;

/**
 * 删除数组中重复的元素,要求时间复杂度O(n),空间复杂度O(1)
 */

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int end = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[end - 1] != nums[i]) {
                nums[end] = nums[i];
                end++;
            }
        }
        return end;
    }

}
