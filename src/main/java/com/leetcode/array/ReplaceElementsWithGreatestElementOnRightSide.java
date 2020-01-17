package com.leetcode.array;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                }
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public int[] replaceElementsInOtherWay(int[] arr) {
        int right = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = right;
            if (temp > right) {
                right = temp;
            }
        }
        return arr;
    }
}
