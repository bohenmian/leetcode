package com.leetcode.array;

public class Average {

    public double average(int[] salary) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int value : salary) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            sum += value;
        }
        return (sum - max - min) * 1.0 / (salary.length - 2);
    }
}
