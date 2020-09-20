package com.leetcode.array;

public class FindMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        return Math.max(count, maxCount);
    }

    // window slide
    public int findMaxConsecutiveOnesInOtherWay(int[] nums) {
        int left = 0;
        int right = 0;
        int maxSize = 0;
        while (right < nums.length) {
            if (nums[right++] == 0) {
                // the last number equals 0, so for the max size we need to sub 1
                maxSize = Math.max(maxSize, right - left - 1);
                left = right;
            }
        }
        return Math.max(maxSize, right - left);
    }
}
