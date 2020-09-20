package com.leetcode.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class FindShortestSubArray {

    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            left.putIfAbsent(value, i);
            right.put(value, i);
            count.put(value, count.getOrDefault(value, 0) + 1);
        }
        int result = nums.length;
        int degree = Collections.max(count.values());
        for (int key : count.keySet()) {
            if (count.get(key) == degree) {
                result = Math.min(result, right.get(key) - left.get(key) + 1);
            }
        }
        return result;
    }

}
