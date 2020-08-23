package com.leetcode.array;

public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] num : A) {
            int start = 0;
            int end = num.length - 1;
            while (start <= end) {
                int temp = num[end] ^ 1;
                num[end--] = num[start] ^ 1;
                num[start++] = temp;
            }
        }
        return A;
    }
}
