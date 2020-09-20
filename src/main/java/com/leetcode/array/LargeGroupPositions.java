package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargeGroupPositions {

    public List<List<Integer>> largeGroupPositions(String s) {
        int count = 1;
        int start = 0;
        int end = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count >= 3) {
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(end);
                    result.add(list);
                }
                count = 1;
                start = i;
            }
            end = i;
        }
        if (count >= 3) {
            List<Integer> list = new ArrayList<>();
            list.add(start);
            list.add(end);
            if (!result.contains(list)) result.add(list);
        }
        return result;
    }


    // slide window
    public List<List<Integer>> largeGroupPositionsOtherWay(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            if (s.charAt(start) != s.charAt(end)) {
                if (end - start >= 3) {
                    result.add(Arrays.asList(start, end - 1));
                }
                start = end;
            }
            end++;
        }
        if (end - start >= 3) {
            result.add(Arrays.asList(start, end - 1));
        }
        return result;
    }
}
