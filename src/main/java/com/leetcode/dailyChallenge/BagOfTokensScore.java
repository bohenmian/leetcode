package com.leetcode.dailyChallenge;

import java.util.Arrays;

public class BagOfTokensScore {

    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1;
        int points = 0, result = 0;
        while (left <= right && (P >= tokens[left] || points > 0)) {
            while (left <= right && P >= tokens[left]) {
                P -= tokens[left++];
                points++;
            }
            result = Math.max(result, points);
            if (left <= right && points > 0) {
                P += tokens[right--];
                points--;
            }
        }
        return result;
    }
}
