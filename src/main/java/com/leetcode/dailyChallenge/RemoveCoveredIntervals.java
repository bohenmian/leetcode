package com.leetcode.dailyChallenge;

import java.util.Arrays;

public class RemoveCoveredIntervals {

    public int removeCoveredIntervals(int[][] intervals) {
        int result = intervals.length;
        // 左端点递增排序，右端点递减排序
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        int max = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][1] <= max) {
                // i的左端点大于i-1的左端点, i的右端点小于i-1的右端点,那么i这个区间就被覆盖
                result--;
            } else {
                max = intervals[i][1];
            }
        }
        return result;
    }

    // https://leetcode-cn.com/problems/remove-covered-intervals/solution/shan-chu-bei-fu-gai-qu-jian-by-leetcode-2/
    public int removeCoveredIntervalsOtherWay(int[][] intervals) {
        int result = 0;
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        int end, prevEnd = 0;
        for (int[] interval : intervals) {
            end = interval[1];
            if (prevEnd < end) {
                result++;
                prevEnd = end;
            }
        }
        return result;
    }
}
