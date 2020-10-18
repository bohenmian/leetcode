package com.leetcode.array;

public class NumSpecial {

    public int numSpecial(int[][] mat) {
        int result = 0;
        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                //(0,0) + (0,1) + (0,2)
                rows[i] += mat[i][j];
                //(0,0) + (1,0) + (2,0)
                cols[j] += mat[i][j];
            }
        }
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                if (mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1) {
                    // 这一行不可能再出现1,优化跳出foreach
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
