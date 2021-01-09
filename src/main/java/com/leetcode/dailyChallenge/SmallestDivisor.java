package com.leetcode.dailyChallenge;

public class SmallestDivisor {

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 1000000;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            int cal = cal(nums, mid);
            if (cal > threshold) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    private int cal(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
        }
        return sum;
    }
}
