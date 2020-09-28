package com.leetcode.array;

public class FindLengthOfLCIS {

    public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] >= nums[i]) {
                // 记录递增子序列的起始index
                left = i;
            }
            result = Math.max(result, i - left + 1);
        }
        return result;
    }

    public int findLengthOfLCISOtherWay(int[] nums) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;
    }

}
