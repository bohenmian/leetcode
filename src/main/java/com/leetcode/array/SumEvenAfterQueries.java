package com.leetcode.array;

public class SumEvenAfterQueries {

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[queries.length];
        int sum = 0;
        for (int value : A) {
            if (value % 2 == 0) {
                sum += value;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int value = queries[i][0];
            if (A[index] % 2 == 0) {
                sum -= A[index];
            }
            A[index] += value;
            if (A[index] % 2 == 0) {
                sum += A[index];
            }
            result[i] = sum;
        }
        return result;
    }
}
