package com.leetcode.array;

public class MinCostToMoveChips {

    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int j : position) {
            if ((j & 1) == 1) odd++;
            else even++;
        }
        return Math.min(odd, even);
    }
}
