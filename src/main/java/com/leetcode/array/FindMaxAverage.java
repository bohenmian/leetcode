package com.leetcode.array;

public class FindMaxAverage {

    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        Double result = null;
        double sum = 0.0;
        while (right < nums.length) {
            sum += nums[right++];
            if (right - left == k) {
                result = result == null ? sum / k : Math.max(result, sum / k);
                sum -= nums[left++];
            }
        }
        return result;
    }

}
