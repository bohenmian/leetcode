package com.leetcode.array;

// 0 3 1 4 2 5 N=3
// 0 4 1 5 3 6 4 7 N=4

public class Shuffle {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }
        return result;
    }
}
