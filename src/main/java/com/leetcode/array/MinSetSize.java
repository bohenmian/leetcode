package com.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinSetSize {

    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        int index = map.size() - 1;
        int count = 0;
        while (index > 0) {
            count += list.get(index).getValue();
            if (count >= arr.length / 2) {
                return map.size() - index;
            }
            index--;
        }
        return 1;
    }
}
