package com.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalSort {

    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int dLen = m + n - 1;

        ArrayList<Integer>[] diagonal = new ArrayList[dLen];

        for (int i = 0; i < dLen; i++) {
            diagonal[i] = new ArrayList<>(m);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diagonal[j - i + (m - 1)].add(mat[i][j]);
            }
        }

        for (int i = 0; i < dLen; i++) {
            Collections.sort(diagonal[i]);
        }
        int[][] result = new int[m][n];
        int[] next = new int[dLen];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 对角线的坐标
                int index = j - i + (m - 1);
                // 记录结果
                result[i][j] = diagonal[index].get(next[index]);
                // 维护 next 数组的值
                next[index]++;
            }
        }
        return result;
    }
}
