package com.leetcode.dailyChallenge;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int i = 0;
        // 原地排序, 下标为i的值应该为i+1, 如果不满足则交换
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                // swap
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            } else i++;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
        }
        return nums.length + 1;
    }
}
