package com.leetcode.array;

public class SumOddLengthSubArrays {

    public int sumOddLengthSubArrays(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1, right = arr.length - i;
            int leftEven = (left + 1) / 2, leftOdd = left / 2;
            int rightEven = (right + 1) / 2, rightOdd = right / 2;
            result += (leftEven * rightEven + leftOdd * rightOdd) * arr[i];
        }
        return result;
    }
}
