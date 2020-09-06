package com.leetcode.array;

public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int j : arr1) {
            count[j]++;
        }
        int index = 0;
        for (int j : arr2) {
            while (count[j] > 0) {
                arr1[index++] = j;
                count[j]--;
            }
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr1[index++] = i;
                count[i]--;
            }
        }
        return arr1;
    }
}
