package com.leetcode.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayPartition {

    public int arrayPairSum(int[] sums) {
        int result = 0;
        int[] array = Stream.of(sums)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result += array[i];
            }
        }
        return result;
    }

    public int arrayPairSumInOtherWay(int[] sum) {
        int result = 0;
        Arrays.sort(sum);
        for (int i = 0; i < sum.length; i = i + 2) {
            result += sum[i];
        }
        return result;
    }
}
