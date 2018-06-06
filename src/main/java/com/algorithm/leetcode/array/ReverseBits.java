package com.algorithm.leetcode.array;

public class ReverseBits {

    public int reverseBits(int n) {
        int reverse = 0;
        for (int i = 0; i < 32; i++) {
            reverse += n & 1;
            n >>>= 1;
            if (i < 31) {
                reverse <<= 1;
            }
        }
        return reverse;
    }
}
