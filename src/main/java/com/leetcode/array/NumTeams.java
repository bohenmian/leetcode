package com.leetcode.array;

public class NumTeams {

    public int numTeams(int[] rating) {
        int n = rating.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int[] left = count(rating, 0, i, rating[i]);
            int[] right = count(rating, i, n, rating[i]);
            result += left[1] * right[0] + left[0] * right[1];
        }
        return result;
    }

    private int[] count(int[] rating, int from, int to, int key) {
        int[] result = new int[2];
        for (int i = from; i < to; i++) {
            if (rating[i] < key) result[0]++;
            if (rating[i] > key) result[1]++;
        }
        return result;
    }
}
