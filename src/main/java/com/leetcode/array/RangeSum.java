package com.leetcode.array;

import java.util.Arrays;

public class RangeSum {

    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        int sumLength = (n + 1) * n / 2;
        int[] sums = new int[sumLength];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                sums[index++] = sum;
            }
        }
        Arrays.sort(sums);
        int result = 0;
        for (int i = left - 1; i < right; i++) {
            // sums[i] % mod + sums[i + 1 % mod
            result = (result + sums[i]) % mod;
        }

        return result;
    }
}
