package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), k, 1, n);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> list, int k, int start, int n) {
        if (list.size() == k || n <= 0) {
            if (list.size() == k && n == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            list.add(i);
            dfs(result, list, k, i + 1, n - i);
            list.remove(list.size() - 1);
        }
    }
}
