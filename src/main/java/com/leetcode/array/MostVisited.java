package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class MostVisited {

    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> result = new ArrayList<>();
        int start = rounds[0];
        int end = rounds[rounds.length - 1];
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                result.add(i);
            }
        } else {
            // because the result is ordered, so we need to add the i to end
            for (int i = 1; i <= end; i++) {
                result.add(i);
            }
            for (int i = start; i <= n; i++) {
                result.add(i);
            }
        }
        return result;
    }
}
