package com.leetcode.array;

public class FindSpecialInteger {

    public int findSpecialInteger(int[] arr) {
        int windowsSize = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + windowsSize]) {
                return arr[i];
            }
        }
        return 0;
    }

    // O(Log N)
    public int findSpecialIntegerInOtherWay(int[] arr) {
        int windowsSize = arr.length / 4;
        for (int i = 0; i < arr.length; i += windowsSize) {
            int left = lowerBound(arr, arr[i]);
            int right = upperBound(arr, arr[i]);
            if (right - left > windowsSize) {
                return arr[i];
            }
        }
        return 0;
    }

    private int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = ((high - low) >> 1) + low;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = ((high - low) >> 1) + low;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
