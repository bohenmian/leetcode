package com.leetcode.array;

public class DominantIndex {

    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }

        }
        for (int num : nums) {
            if (num != nums[maxIndex] && nums[maxIndex] < 2 * num) return -1;
        }
        return maxIndex;
    }
}
