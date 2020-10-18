package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindRepeatedDnaSequences {

    public List<String> findRepeatedDnaSequences(String s) {
        int length = 10;
        int left = 0;
        HashSet<String> set = new HashSet<>();
        HashSet<String> result = new HashSet<>();
        while (left + length - 1 < s.length()) {
            String substring = s.substring(left, left + length);
            if (set.contains(substring)) result.add(substring);
            set.add(substring);
            left++;
        }
        return new ArrayList<>(result);
    }
}
