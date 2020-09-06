package com.leetcode.array;

import java.util.Arrays;

public class KWeakestRows {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] count = new int[mat.length];
        int[] result = new int[k];
        for (int i = 0; i < mat.length; i++) {
            // If you don’t multiply by 100 plus i, then you will have the same value
            // So this there multiply 100 plus i used to mask the value
            count[i] = count(mat[i]) * 100 + i;
        }
        Arrays.sort(count);
        for (int i = 0; i < k; i++) {
            result[i] = count[i] % 100;
        }
        return result;
    }

    private int count(int[] nums) {
        int sum = 0;
        for (int value : nums) {
            if (value != 0) {
                sum++;
            }
        }
        return sum;
    }

}
