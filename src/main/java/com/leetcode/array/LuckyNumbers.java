package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbers {

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowsLength = matrix.length;
        int colsLength = matrix[0].length;
        int[] rowLineMin = new int[rowsLength];
        // need to set the init number to Integer Max
        Arrays.fill(rowLineMin, Integer.MAX_VALUE);
        int[] colLineMax = new int[colsLength];
        for (int i = 0; i < rowsLength; i++) {
            for (int j = 0; j < colsLength; j++) {
                rowLineMin[i] = Math.min(rowLineMin[i], matrix[i][j]);
                colLineMax[j] = Math.max(colLineMax[j], matrix[i][j]);
            }
        }
        for (int i = 0; i < rowsLength; i++) {
            for (int j = 0; j < colsLength; j++) {
                if (matrix[i][j] == rowLineMin[i] && matrix[i][j] == colLineMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
