package com.leetcode.array;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargestOverlap {

    public int largestOverlap(int[][] A, int[][] B) {
        int N = A.length;
        List<Point> A2 = new ArrayList<>();
        List<Point> B2 = new ArrayList<>();

        for (int i = 0; i < N * N; i++) {
            if (A[i / N][i % N] == 1) A2.add(new Point(i / N, i % N));
            if (B[i / N][i % N] == 1) B2.add(new Point(i / N, i % N));
        }

        Set<Point> points = new HashSet<>(B2);
        int result = 0;
        Set<Point> seen = new HashSet<>();
        for (Point a : A2) {
            for (Point b : B2) {
                Point delta = new Point(b.x - a.x, b.y - a.y);
                if (!seen.contains(delta)) {
                    seen.add(delta);
                    int temp = 0;
                    for (Point point : A2) {
                        if (points.contains(new Point(point.x + delta.x, point.y + delta.y))) {
                            temp++;
                        }
                    }
                    result = Math.max(result, temp);
                }
            }
        }
        return result;
    }

    public int largestOverlapOtherWay(int[][] img1, int[][] img2) {
        int N = img1.length;
        int[][] count = new int[N * 2 + 1][N * 2 + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (img1[i][j] == 1) {
                    for (int i1 = 0; i1 < N; i1++) {
                        for (int j1 = 0; j1 < N; j1++) {
                            if (img2[i1][j1] == 1) {
                                count[i - i1 + N][j - j1 + N] += 1;
                            }
                        }
                    }
                }
            }
        }
        int result = 0;

        for (int[] row: count) {
            for (int value : row) {
                result = Math.max(value, result);
            }

        }
        return result;
    }
}
