package com.leetcode.dailyChallenge;

public class CountTriplets {

    public int countTriplets(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                temp ^= arr[k];
                if (temp == 0) result += k - i;
            }
        }
        return result;
    }

}
