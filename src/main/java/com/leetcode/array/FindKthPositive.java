package com.leetcode.array;

public class FindKthPositive {

    public int findKthPositive(int[] arr, int k) {
        int[] count = new int[2001];
        for (int j : arr) {
            count[j]++;
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                k--;
            }
            if (k == 0) {
                return i;
            }
        }
        return 0;
    }

    public int findKthPositiveOtherWay(int[] arr, int k) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] - i - i >= k) {
                return k + i;
            }
        }
        return k + i;
    }

    public int findKthPositiveThreeWay(int[] arr, int k) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int middle = low + (high - low) >> 1;
            if (arr[middle] - middle >= k) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return k + low;
    }
}
