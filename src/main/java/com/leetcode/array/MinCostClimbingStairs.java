package com.leetcode.array;

public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int cost1 = 0;
        int cost2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int cost0 = Math.min(cost1, cost2) + cost[i];
            cost2 = cost1;
            cost1 = cost0;
        }
        return Math.min(cost1, cost2);
    }
}
