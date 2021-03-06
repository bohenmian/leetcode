package com.leetcode.array;

public class NumOfSubarrays {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sumOfK = k * threshold;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i < k - 1) continue;
            if (i > k - 1) sum -= arr[i - k];
            if (sum >= sumOfK) count++;
        }
        return count;
    }
}
