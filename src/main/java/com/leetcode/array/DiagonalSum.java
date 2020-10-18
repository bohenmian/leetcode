package com.leetcode.array;

public class DiagonalSum {

    public int diagonalSum(int[][] mat) {
        int result = 0;
        int matLength = mat.length;
        for (int i = 0; i < matLength; i++) {
            result += mat[i][i];
            result += mat[matLength - i - 1][i];
        }
        return matLength / 2 == 0 ? result : result - mat[matLength / 2][matLength / 2];
    }
}
