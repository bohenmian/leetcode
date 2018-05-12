package com.algorithm.leetcode.array;

/**
 * 查找一个数字在数组中的位置,如果没有则计算插入的位置
 * 二分查找的应用,free-bug
 */

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (nums[middle] > target) {
                high = middle - 1;
            } else if (nums[middle] < target) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return low;
    }
}
