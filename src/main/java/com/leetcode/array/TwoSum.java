package com.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (map.containsKey(number)) {
                result[0] = map.get(number);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
