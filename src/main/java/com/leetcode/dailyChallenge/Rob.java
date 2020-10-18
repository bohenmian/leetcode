package com.leetcode.dailyChallenge;

/**
 * https://leetcode-cn.com/problems/house-robber/solution/dong-tai-gui-hua-jie-ti-si-bu-zou-xiang-jie-cjavap/
 */

public class Rob {

    public int rob(int[] nums) {
        int prev = 0;
        int curr = 0;

        for (int i : nums) {
            int temp = Math.max(curr, prev + i);
            prev = curr;
            curr = temp;
        }

        return curr;
    }

    public int robInDp(int[] nums) {
        if (nums.length == 0) return 0;
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[length - 1];
    }
}
