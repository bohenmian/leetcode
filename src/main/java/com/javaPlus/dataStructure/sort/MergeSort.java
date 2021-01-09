package com.javaPlus.dataStructure.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        mergeSort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
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
    }
}
