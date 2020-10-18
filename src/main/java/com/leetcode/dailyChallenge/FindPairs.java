package com.leetcode.dailyChallenge;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {

    public int findPairs(int[] nums, int k) {
        int result = 0;
        if (k < 0) return result;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (k == 0 && value > 1) result++;
            else if (k != 0 && map.containsKey(key - k)) result++;
        }
        return result;
    }
}
