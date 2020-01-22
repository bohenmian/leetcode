package com.leetcode.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] A) {
        return Stream.of(A)
                .flatMapToInt(Arrays::stream)
                .map(x -> x * x)
                .sorted()
                .toArray();
    }

    public int[] sortedSquaresInOtherWay(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, k = n - 1, j = n - 1;
        while (i <= j) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[k] = A[i] * A[i];
                i++;
            } else {
                result[k] = A[j] * A[j];
                j--;
            }
            k--;
        }
        return result;
    }
}
