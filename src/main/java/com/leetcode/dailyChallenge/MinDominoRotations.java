package com.leetcode.dailyChallenge;

public class MinDominoRotations {

    public int minDominoRotations(int[] A, int[] B) {
        int n = A.length;
        int rotation = check(A[0], B, A, n);
        if (rotation != -1 || A[0] == B[0]) return rotation;
        else return check(B[0], B, A, n);
    }

    private int check(int x, int[] A, int[] B, int n) {
        int rotation_a = 0, rotation_b = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != x && B[i] != x) return -1;
            else if (A[i] != x) rotation_a++;
            else if (B[i] != x) rotation_b++;
        }
        return Math.min(rotation_a, rotation_b);
    }
}
