package com.leetcode.array;

public class MinTimeToVisitAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int a = Math.abs(points[i][0] - points[i + 1][0]);
            int b = Math.abs(points[i][1] - points[i + 1][1]);
            result += Math.max(a, b);
        }
        return result;
    }

    public int minTimeToVisitAllPointsInOtherWays(int[][] points) {
        int result = 0;
        for (int i = 1; i < points.length; i++) {
            int a = Math.abs(points[i][0] - points[i - 1][0]);
            int b = Math.abs(points[i][1] - points[i - 1][1]);
            result += Math.max(a, b);
        }
        return result;
    }
}
