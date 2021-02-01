package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int length = candidates.length;
        List<List<Integer>> result = new ArrayList<>();
        if (length == 0) return result;
        Arrays.sort(candidates);
        dfs(candidates, result, new ArrayList<>(), 0, target, length);
        return result;
    }

    private void dfs(int[] candidates, List<List<Integer>> result, List<Integer> list, int start, int target, int length) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < length; i++) {
            if (target - candidates[i] < 0) return;
            list.add(candidates[i]);
            dfs(candidates, result, list, i, target - candidates[i], length);
            list.remove(list.size() - 1);
        }
    }
}
