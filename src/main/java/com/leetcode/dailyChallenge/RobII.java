package com.leetcode.dailyChallenge;

import java.util.Arrays;

public class RobII {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                myRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private int myRob(int[] nums) {
        int prev = 0;
        int curr = 0;
        for (int value : nums) {
            int temp = Math.max(prev + value, curr);
            prev = curr;
            curr = temp;
        }
        return curr;
    }
}
