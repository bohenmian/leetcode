package com.leetcode.array;

public class XorOperation {

    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            int temp = start + i * 2;
            result ^= temp;
        }
        return result;
    }
}
