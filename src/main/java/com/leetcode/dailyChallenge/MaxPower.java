package com.leetcode.dailyChallenge;

public class MaxPower {

    public int maxPower(String s) {
        int result = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(left)) {
                result = Math.max(result, i - left);
                left = i;
            }
        }
        return Math.max(result, s.length() - left);
    }
}
