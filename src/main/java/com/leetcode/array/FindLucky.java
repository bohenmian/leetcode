package com.leetcode.array;

public class FindLucky {

    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for (int value : arr) {
            count[value]++;
        }
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0 && i == count[i]) {
                max = Math.max(max, count[i]);
            }
        }
        return max == 0 ? -1 : max;
    }
}
