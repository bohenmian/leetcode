package com.leetcode.array;

public class FindNUniqueIntegersSumUpToZero {

    public int[] sumZero(int n) {
        int[] result = new int[n];
        int i = 0;
        int j = -n + 1;
        while (i < n) {
            result[i] = j;
            i++;
            j += 2;
        }
        return result;
    }

    // n = 5, result = {-4, -2, 0, 2, 4}
    // n = 4, result = {-3, -1, 1, 3}
    // n = 3, result = {-2, 0, 2}
    public int[] sumZeroInOtherWay(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i * 2 - n + 1;
        }
        return result;
    }

    public int[] sumZeroOtherWays(int n) {
        int[] result = new int[n];
        int count = n / 2;
        for (int i = 0; i < count * 2; i += 2) {
            result[i] = -i - 1;
            result[i + 1] = i + 1;
        }
        return result;
    }
}
