package com.leetcode.array;

import java.util.Arrays;

public class GetStrongest {

    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int mid = arr[(arr.length - 1) / 2];
        int[] result = new int[k];
        int index = 0, left = 0, right = arr.length - 1;
        while (index < k) {
            int leftValue = Math.abs(arr[left] - mid);
            int rightValue = Math.abs(arr[right] - mid);
            if (leftValue > rightValue) {
                result[index++] = arr[left++];
            } else {
                result[index++] = arr[right--];
            }
        }
        return result;
    }
}
