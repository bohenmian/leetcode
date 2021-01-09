package com.leetcode.dailyChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindMinHeightTrees {

    // 贪心+BFS
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if (n == 1) {
            result.add(0);
            return result;
        }
        int[] degree = new int[n];
        List<List<Integer>> map = new ArrayList<>();
        for (int i = 0; i < n; i++) map.add(new ArrayList<>());

        for (int[] edge : edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) queue.offer(i);
        }
        while (!queue.isEmpty()) {
            result = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                result.add(cur);
                List<Integer> neighbors = map.get(cur);
                for (int neighbor : neighbors) {
                    degree[neighbor]--;
                    if (degree[neighbor] == 1) {
                        queue.offer(neighbor);
                    }
                }
            }
        }
        return result;
    }
}
