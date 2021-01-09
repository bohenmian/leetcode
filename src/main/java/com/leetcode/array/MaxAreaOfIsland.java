package com.leetcode.array;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result = Math.max(result, dfs(grid, i, j));
            }
        }
        return result;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 0;
        int[] rows = {0, 0, 1, -1};
        int[] cols = {1, -1, 0, 0};
        int ans = 1;
        for (int k = 0; k < 4; k++) {
            int row = i + rows[k], col = j + cols[k];
            ans += dfs(grid, row, col);
        }
        return ans;
    }
}
