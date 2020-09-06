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
        int[] result = new int[A.length];
        int start = 0;
        int end = A.length - 1;
        int newEnd = A.length - 1;
        while (start <= end) {
            int startSquare = A[start] * A[start];
            int endSquare = A[end] * A[end];
            if (startSquare > endSquare) {
                result[newEnd] = startSquare;
                start++;
            } else {
                result[newEnd] = endSquare;
                end--;
            }
            newEnd--;
        }
        return result;
    }
}
