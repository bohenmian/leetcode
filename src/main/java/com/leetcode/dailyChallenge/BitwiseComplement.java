package com.leetcode.dailyChallenge;

public class BitwiseComplement {

    public int bitwiseComplement(int N) {
        int x = N;
        int count = 1;
        // N = 1010 ---------> count = 5
        while (x >> 1 > 0) {
            count++;
            x = x >> 1;
        }
        // temp = 10000, temp-1 = 01111
        int temp = 1 << count;
        return N ^ (temp - 1);
    }
}
