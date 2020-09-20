package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayRankTransform {

    public int[] arrayRankTransform(int[] arr) {
        int[] cloneArray = arr.clone();
        Arrays.sort(cloneArray);
        Map<Integer, Integer> map = new HashMap<>();
        int index = 1;
        for (int i = 0; i < cloneArray.length; i++) {
            if (i == 0) {
                map.put(cloneArray[i], index);
                index++;
            }
            if (i > 0 && cloneArray[i] != cloneArray[i - 1]) {
                map.put(cloneArray[i], index);
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }

    public int[] arrayRankTransformOtherWay(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        int[] count = new int[max - min + 1];
        for (int j : arr) {
            count[j - min] = 1;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count[arr[i] - min];
        }
        return arr;
    }
}
