package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        Set<Integer> set = new HashSet<>();
        for (int value : A) {
            sumA += value;
        }
        for (int value : B) {
            sumB += value;
            set.add(value);
        }
        int delta = (sumB - sumA) / 2;
        for (int value : A) {
            if (set.contains(value + delta)) {
                return new int[]{value, value + delta};
            }
        }
        return null;
    }
}
