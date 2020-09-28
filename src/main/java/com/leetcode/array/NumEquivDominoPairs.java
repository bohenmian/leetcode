package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumEquivDominoPairs {

    // N*Log(N)
    public int numEquivDominoPairs(int[][] dominoes) {
        int result = 0;
        int[] count = new int[100];
        for (int[] domino : dominoes) {
            Arrays.sort(domino);
            result += count[domino[0] * 10 + domino[1]]++;
        }
        return result;
    }

    // O(N)
    public int numEquivDominoPairsOtherWay(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int value;
        int result = 0;
        for (int[] domino : dominoes) {
            if (domino[0] > domino[1]) {
                value = domino[1] * 10 + domino[0];
            } else {
                value = domino[0] * 10 + domino[1];
            }
            Integer count = map.getOrDefault(value, 0);
            map.put(value, count + 1);
        }
        for (int val : map.values()) {
            result += (val - 1) * val / 2;
        }
        return result;
    }
}
