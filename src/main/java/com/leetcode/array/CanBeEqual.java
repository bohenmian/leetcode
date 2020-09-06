package com.leetcode.array;

public class CanBeEqual {

    public boolean canBeEqual(int[] target, int[] arr) {
        int[] countArray = new int[1001];
        for (int i = 0; i < target.length; i++) {
            countArray[target[i]]++;
            countArray[arr[i]]--;
        }
        for (int value : countArray) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
