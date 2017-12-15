package com.nowcoder.common;

import java.util.ArrayList;

public class Solution1 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input == null || input.length == 0 || k > input.length) {
            return arrayList;
        }
        int[] result = partition(input, 0, input.length - 1);
        for (int i = 0; i < k; i++) {
            arrayList.add(result[i]);
        }
        return arrayList;
    }

    private static int[] partition(int[] input, int low, int high) {
        int start = low;
        int end = high;
        int pivot = input[low];
        while (start < end) {
            while (end > start && input[end] >= pivot) {
                --end;
            }
            if (end > start && input[end] <= pivot) {
                int temp = input[end];
                input[end] = input[start];
                input[start] = temp;
            }
            while (end > start && input[start] <= pivot) {
                ++start;
            }
            if (end > start && input[start] >= pivot) {
                int temp = input[start];
                input[start] = input[end];
                input[end] = temp;
            }
        }
        if (start > low) {
            partition(input, low, start - 1);
        }
        if (high > end) {
            partition(input, end + 1, high);
        }
        return input;
    }
}
