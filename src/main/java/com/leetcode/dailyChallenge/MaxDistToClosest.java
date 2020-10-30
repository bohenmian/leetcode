package com.leetcode.dailyChallenge;

public class MaxDistToClosest {

    public int maxDistToClosest(int[] seats) {
        int prev = -1;
        int max = 1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                // 表示以前出现过1, 距离要除以2
                if (prev >= 0) max = Math.max((i - prev) / 2, max);
                // 前面没有1, 不需要除以2
                else max = i;
                // 表示1的下标
                prev = i;
            }
        }
        // 最后0的个数在判断一下
        return Math.max(seats.length - prev, max);
    }
}
