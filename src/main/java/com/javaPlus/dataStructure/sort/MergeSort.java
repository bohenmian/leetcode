package com.javaPlus.dataStructure.sort;

public class MergeSort {

    public int[] mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return new int[end - start + 1];
        }
        int mid = start + ((end - start) >> 1);

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        int k = 0, left = start, right = mid + 1;
        int[] temp = new int[end - start + 1];

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) temp[k++] = arr[left++];
            else temp[k++] = arr[right++];
        }

        while (left <= mid) temp[k++] = arr[left++];
        while (right <= end) temp[k++] = arr[right++];

        for (left = start, right = 0; left <= end; left++, right++) {
            arr[left] = temp[right];
        }
        return arr;
    }
}
