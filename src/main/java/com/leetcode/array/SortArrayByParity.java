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
        int i = 0, j = A.length - 1;
        for (int value : A) {
            if (value % 2 != 0) {
                result[j--] = value;
            } else {
                result[i++] = value;
            }
        }
        return result;
    }
}
