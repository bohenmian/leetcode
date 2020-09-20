package com.leetcode.array;

public class IsMonotonic {

    public boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }

    private boolean increasing(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[i + 1]) return false;
        }
        return true;
    }

    private boolean decreasing(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] < A[i + 1]) return false;
        }
        return true;
    }

    public boolean isMonotonicOtherWay(int[] A) {
        int store = 0;
        for (int i = 0; i < A.length - 1; i++) {
            int c = Integer.compare(A[i], A[i + 1]);
            if (c != 0) {
                if (c != store && store != 0) {
                    return false;
                }
                store = c;
            }
        }
        return true;
    }
}
