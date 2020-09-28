package com.leetcode.array;

public class NumPairsDivisibleBy60 {

    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] seconds = new int[60];
        for (int second : time) {
            seconds[second % 60]++;
        }
        count += seconds[30] * (seconds[30] - 1) / 2;
        count += seconds[0] * (seconds[0] - 1) / 2;
        int start = 1;
        int end = 59;
        while (start < end) {
            count += seconds[start++] * seconds[end--];
        }
        return count;
    }
}
