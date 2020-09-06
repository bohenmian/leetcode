package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i] - arr[i - 1];
            if (temp < min) {
                min = temp;
                result.clear();
            }
            if (temp == min) {
                List<Integer> item = new ArrayList<>(2);
                item.add(arr[i - 1]);
                item.add(arr[i]);
                result.add(item);
            }
        }
        return result;
    }
}
