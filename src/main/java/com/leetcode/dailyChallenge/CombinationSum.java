package com.leetcode.dailyChallenge;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int length = candidates.length;
        List<List<Integer>> result = new ArrayList<>();
        if (length == 0) return result;
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, length, target, path, result);
        return result;
    }

    private void dfs(int[] candidates, int start, int length, int target, Deque<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < length; i++) {
            if (target - candidates[i] < 0)
                break;
            path.addLast(candidates[i]);
            dfs(candidates, i, length, target - candidates[i], path, result);
            path.removeLast();
        }
    }
}
