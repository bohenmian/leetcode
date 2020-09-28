package com.leetcode.dailyChallenge;

public class NumSubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int sum = 1;
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum *= nums[right];
            while (sum >= k) {
                sum /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
