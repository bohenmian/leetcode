package com.leetcode.array;

public class Search {

    public int search(int[] nums, int target) {
        int end = nums.length - 1;
        int start = 0;
        while (start <= end) {
            int middle = ((end - start) >> 1) + start;
            if (nums[middle] > target) {
                end = middle - 1;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
