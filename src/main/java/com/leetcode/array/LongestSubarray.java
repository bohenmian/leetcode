package com.leetcode.array;

public class LongestSubarray {

    public int longestSubarray(int[] nums) {
        int result = 0, sum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += (nums[right] & 1);
            // 如果小于等于right - left - 1, 那么代表窗口内不止一个0, 需要缩减窗口
            while (left < right && sum <= right - left - 1) {
                if (nums[left] == 1) sum--;
                left++;
            }
            result = Math.max(result, right - left);
        }
        return result;
    }
}
