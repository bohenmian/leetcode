package com.leetcode.dailyChallenge;

public class CanCompleteCircuit {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, sum = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            // 记录总的gas是不是大于cost
            total += gas[i] - cost[i];
            // 记录每一步的gas是不是大于0
            sum += gas[i] - cost[i];
            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }
        return total < 0 ? -1 : start;
    }
}
