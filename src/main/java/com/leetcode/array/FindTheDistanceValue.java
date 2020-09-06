package com.leetcode.array;

import java.util.Arrays;

public class FindTheDistanceValue {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int hi = arr2.length - 1;
        int count = 0;
        for (int value : arr1) {
            int index = binarySearch(arr2, hi, value);
            if (index == 0) {
                if (Math.abs(arr2[index] - value) > d)
                    count++;
            } else if (index == hi + 1) {
                if (Math.abs(arr2[hi] - value) > d)
                    count++;
            } else {
                if (Math.abs(arr2[index] - value) > d && Math.abs(arr2[index - 1] - value) > d)
                    count++;
            }
        }
        return count;
    }

    private int binarySearch(int[] arr, int end, int value) {
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < value) start = mid + 1;
            else if (arr[mid] > value) end = mid - 1;
            else return mid;
        }
        return start;
    }


    public int findTheDistanceValueInOtherWay(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int value : arr1) {
            if (qualify(value, arr2, d)) {
                count++;
            }
        }
        return count;
    }

    private boolean qualify(int value, int[] arr, int d) {
        for (int val : arr) {
            if (Math.abs(value - val) <= d) return false;
        }
        return true;
    }
}
