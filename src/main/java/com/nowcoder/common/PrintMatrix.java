package com.nowcoder.common;

import java.util.ArrayList;

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList list = new ArrayList();
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (matrix == null || rows == 0 || cols == 0) {
            return null;
        }
        int start = 0;
        while (cols > start * 2 && rows > start * 2) {
            int endX = cols - 1 - start;
            int endY = rows - 1 - start;
            for (int i = start; i <= endX; i++) {
                list.add(matrix[start][i]);
            }
            if (start < endY) {
                for (int i = start + 1; i <= endY; i++) {
                    list.add(matrix[i][endX]);
                }
            }
            if (start < endX && start < endY) {
                for (int i = endX - 1; i >= start; i--) {
                    list.add(matrix[endY][i]);
                }
            }
            if (start < endX && start < endY - 1) {
                for (int i = endY - 1; i >= start + 1; i--) {
                    list.add(matrix[i][start]);
                }
            }
            ++start;
        }
        return list;
    }
}
