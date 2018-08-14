package com.javaPlus.dataStructure.sort;

public class QuickSort {

    public static void quickSort(int[] array, int start, int end) {
        //数组中间元素作为哨兵
        if (start >= end || array == null || array.length <= 1) {
            return;
        }
        int i = start;
        int j = end;
        int pivot = array[(start + end) >>> 1];
        while (i <= j) {
            while (array[i] < pivot) {
                ++i;
            }
            while (array[j] > pivot) {
                --j;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }
        quickSort(array, start, j);
        quickSort(array, i, end);


        //数组第一个元素作为哨兵
//        int i = start;
//        int j = end;
//        int pivot = array[start];
//        while (i < j) {
//            while (j > i && pivot <= array[j])
//                --j;
//            if (array[j] < pivot) {
//                int temp = array[j];
//                array[j] = array[i];
//                array[i] = temp;
//            }
//            while (j > i && array[i] <= pivot) {
//                ++i;
//            }
//            if (array[i] > pivot) {
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//        if (i > start) {
//            quickSort(array, start, i - 1);
//        }
//        if (j < end) {
//            quickSort(array, j + 1, end);
//        }
//
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
