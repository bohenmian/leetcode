package com.leetcode.array;

public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] rows : A) {
            int start = 0, end = rows.length - 1;
            while (start <= end) {
                int temp = rows[start] ^ 1;
                rows[start] = rows[end] ^ 1;
                rows[end] = temp;
                start++;
                end--;
            }
        }
        return A;
    }
}
