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
}
