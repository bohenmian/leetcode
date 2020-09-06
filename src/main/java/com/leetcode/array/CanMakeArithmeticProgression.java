package com.leetcode.array;

import java.util.Arrays;

public class CanMakeArithmeticProgression {

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int count = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != count) {
                return false;
            }
        }
        return true;
    }
}
