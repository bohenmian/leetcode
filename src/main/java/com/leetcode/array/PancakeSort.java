package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PancakeSort {

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int maxIndex = findMaxIndex(arr, i);
            if (maxIndex == -1) {
                continue;
            }
            reverse(arr, maxIndex);
            result.add(maxIndex + 1);
            reverse(arr, i);
            result.add(i + 1);
        }
        return result;
    }

    private int findMaxIndex(int[] arr, int k) {
        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i <= k; i++) {
            if (maxValue < arr[i]) {
                maxIndex = i;
                maxValue = arr[i];
            }
        }
        return maxIndex;
    }

    private void reverse(int[] arr, int end) {
        int start = 0;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
