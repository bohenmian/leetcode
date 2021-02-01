package com.algorithm.nowcoder.array;

/**
 * 数组中逆序对的数量
 */

public class FindTheReversePairCount {

    public int findTheReversePairCount(int[] arr) {
        return findTheReversePairCount(arr, 0, arr.length - 1);
    }

    private int findTheReversePairCount(int[] arr, int start, int end) {
        if (start >= end) return 0;
        int result = 0;
        int[] temp = new int[end - start + 1];
        int mid = start + ((end - start) >> 1);
        result += findTheReversePairCount(arr, start, mid) + findTheReversePairCount(arr, mid + 1, end);
        int left = start, right = mid + 1, k = 0;
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) temp[k++] = arr[left++];
            else {
                temp[k++] = arr[right++];
                result += mid + 1 - left;
            }
        }

        while (left <= mid) temp[k++] = arr[left++];
        while (right <= end) temp[k++] = arr[right++];

        for (left = start, right = 0; left <= end; left++, right++) {
            arr[left] = temp[right];
        }
        return result;
    }

}
