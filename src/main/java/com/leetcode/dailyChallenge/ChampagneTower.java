package com.leetcode.dailyChallenge;

public class ChampagneTower {

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] A = new double[102][102];
        A[0][0] = poured;
        for (int r = 0; r <= query_row; r++) {
            for (int c = 0; c <= r; c++) {
                double v = (A[r][c] - 1.0) / 2.0;
                A[r + 1][c] += v;
                A[r + 1][c + 1] += v;
            }
        }
        return Math.min(1, A[query_row][query_glass]);
    }
}
