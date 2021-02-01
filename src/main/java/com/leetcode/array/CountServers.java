package com.leetcode.array;

public class CountServers {

    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] countRow = new int[m];
        int[] countCol = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    countRow[i]++;
                    countCol[j]++;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && (countRow[i] > 1 || countCol[j] > 1)) result++;
            }
        }
        return result;
    }
}
