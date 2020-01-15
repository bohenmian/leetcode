package com.leetcode.array;

import java.util.Arrays;

public class CellsWithOddValuesInMatrix {

    public int oddCells(int n, int m, int[][] indices) {
        int[][] oddMatrix = new int[n][m];
        for (int[] ind : indices) {
            for (int col = 0; col < m; col++) {
                oddMatrix[ind[0]][col]++;
            }
            for (int row = 0; row < n; row++) {
                oddMatrix[row][ind[1]]++;
            }
        }
        return (int) Arrays.stream(oddMatrix)
                .flatMapToInt(Arrays::stream)
                .filter(value -> value % 2 == 1)
                .count();
    }

    public int oddCellsInOtherWays(int n, int m, int[][] indices) {
        int result = 0;
        boolean[] col = new boolean[n];
        boolean[] row = new boolean[m];
        for (int[] ind : indices) {
            col[ind[0]] ^= true;
            row[ind[1]] ^= true;
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (col[i] ^ row[j])
                    result++;
            }
        }
        return result;
    }
}
