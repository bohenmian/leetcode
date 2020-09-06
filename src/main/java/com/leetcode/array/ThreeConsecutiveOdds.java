package com.leetcode.array;

public class ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] & arr[i + 1] & arr[i + 2]) % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
