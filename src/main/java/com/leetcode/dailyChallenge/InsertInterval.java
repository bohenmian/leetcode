package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * TODO
 * https://leetcode-cn.com/problems/insert-interval/solution/cha-ru-qu-jian-by-leetcode/
 */

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] newIntervals = new int[n + 1][2];
        //将newInterval和Intervals都输入一个数组
        for (int i = 0; i < n; i++) {
            newIntervals[i][0] = intervals[i][0];
            newIntervals[i][1] = intervals[i][1];
        }
        newIntervals[n][0] = newInterval[0];
        newIntervals[n][1] = newInterval[1];
        //合并区间
        return merger(newIntervals);
    }

    private int[][] merger(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0], right = intervals[i][1];
            while (i < intervals.length - 1 && right >= intervals[i + 1][0]) {
                right = Math.max(right, intervals[i + 1][1]);
                i++;
            }
            result.add(new int[]{left, right});
        }
        return result.toArray(new int[0][]);
    }
}
