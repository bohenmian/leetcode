package com.algorithm.leetcode.common;

/**
 * 删除数组中的指定元素
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0, k = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
            i++;
        }
        return k;
    }
}
