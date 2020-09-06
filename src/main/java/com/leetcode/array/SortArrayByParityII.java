package com.leetcode.array;

public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2) {
            if ((A[i] & 1) == 1) {
                while ((A[j] & 1) == 1) {
                    j += 2;
                }
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        return A;
    }
}
