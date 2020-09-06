package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        String[] words = S.split("");
        Map<String, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            end = Math.max(map.get(words[i]), end);
            if (i == end) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
