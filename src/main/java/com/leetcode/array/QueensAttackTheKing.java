package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensAttackTheKing {

    public List<List<Integer>> queensAttackTheKing(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[][] table = new boolean[8][8];
        for (int[] queen : queens) {
            table[queen[0]][queen[1]] = true;
        }
        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        for (int[] direction : directions) {
            for (int x = king[0], y = king[1]; x >= 0 && x < 8 && y >= 0 && y < 8; x += direction[0], y += direction[1]) {
                if (table[x][y]) {
                    result.add(Arrays.asList(x, y));
                    break;
                }
            }
        }
        return result;
    }
}
