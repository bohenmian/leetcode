package com.leetcode.dailyChallenge;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinArrowShots {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int arrow = 1;
        int xStart, xEnd, firstEnd = points[0][1];
        for (int[] point : points) {
            xStart = point[0];
            xEnd = point[1];
            if (firstEnd < xStart) {
                arrow++;
                firstEnd = xEnd;
            }
        }
        return arrow;
    }
}
