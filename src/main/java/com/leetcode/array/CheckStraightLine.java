package com.leetcode.array;

public class CheckStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        float slope = getSlope(coordinates[1], coordinates[0]);
        for (int i = 1; i < coordinates.length; i++) {
            float value = getSlope(coordinates[0], coordinates[i]);
            if (value != slope) return false;
        }
        return true;
    }

    private float getSlope(int[] p1, int[] p2) {
        if (p1[0] == p2[0]) return 0;
        return (float) (p2[1] - p1[1]) / (p2[0] - p1[0]);
    }

    public boolean checkStraightLineOtherWay(int[][] coordinates) {
        int x = coordinates[1][0] - coordinates[0][0];
        int y = coordinates[1][1] - coordinates[0][1];

        for (int i = 1; i < coordinates.length; i++) {
            int curr_x = coordinates[i][0] - coordinates[0][0];
            int curr_y = coordinates[i][1] - coordinates[0][1];
            // 避免除法
            // y / x = curr_y / curr_x  -----> x * curr_y = y * curr_x
            if (y * curr_x != x * curr_y) return false;
        }
        return true;
    }
}
