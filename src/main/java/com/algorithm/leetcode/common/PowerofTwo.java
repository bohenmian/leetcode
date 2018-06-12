package com.algorithm.leetcode.common;

public class PowerofTwo {

    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        if (count == 1) {
            return true;
        }
        return false;
    }
}
