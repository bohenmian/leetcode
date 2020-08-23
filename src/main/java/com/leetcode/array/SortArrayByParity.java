package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        Arrays.stream(A)
                .forEach(num -> {
                    if (num % 2 == 0) {
                        evenList.add(num);
                    } else {
                        oddList.add(num);
                    }
                });
        evenList.addAll(oddList);
        return evenList.stream().mapToInt(i -> i).toArray();
    }

    public int[] sortArrayByParityInOtherWay(int[] A) {
        int[] result = new int[A.length];
        int start = 0;
        int end = A.length - 1;
        for (int value : A) {
            if ((value & 1) == 1) {
                result[end--] = value;
            } else {
                result[start++] = value;
            }
        }
        return result;
    }

    public int[] sortArrayByParityInOtherWays(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            if ((A[start] & 1) == 1 && (A[end] & 1) != 1) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            } else if ((A[start] & 1) != 1) {
                start++;
            } else if ((A[end] & 1) == 1) {
                end--;
            }
        }
        return A;
    }


}
