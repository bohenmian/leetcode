package com.leetcode.array;

public class NumTimesAllBlue {


    public int numTimesAllBlue(int[] light) {
        int result = 0;
        int curMax = 0;
        for (int i = 0; i < light.length; i++) {
            curMax = Math.max(light[i], curMax);
            if (curMax == i + 1) {
                result++;
            }
        }
        return result;
    }

}
