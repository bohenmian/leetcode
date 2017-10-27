package com.nowcoder.common;

public class CountNumberOfOne {

    public int NubberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
