package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QueensThatCanAttackTheKing {

    public List<List<Integer>> queensAttackTheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        Set<Integer> queenSet = new HashSet<>();
        for (int[] queen : queens) {
            queenSet.add(queen[0] * 8 + queen[1]);
        }
        for (int[] dir : dirs) {
            boolean exist = false;
            int nx = 0, ny = 0;
            for (int i = 1; i <= 7; i++) {
                nx = king[0] + i * dir[0];
                ny = king[1] + i * dir[1];
                if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
                    if (queenSet.contains(nx * 8 + ny)) {
                        exist = true;
                        break;
                    }
                }
            }
            if (exist) ans.add(Arrays.asList(nx, ny));
        }
        return ans;
    }
}
