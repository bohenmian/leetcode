package com.leetcode.dailyChallenge;

/*
  https://leetcode-cn.com/problems/word-break/solution/shou-hui-tu-jie-san-chong-fang-fa-dfs-bfs-dong-tai/
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordBreak {

    // DFS
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] visited = new boolean[s.length() + 1];
        return dfs(s, 0, wordDict, visited);
    }

    private boolean dfs(String s, int start, List<String> wordDict, boolean[] visited) {
        for (String word : wordDict) {
            int nextStart = start + word.length();
            if (nextStart > s.length() || visited[nextStart]) continue;
            if (s.indexOf(word, start) == start) {
                if (nextStart == s.length() || dfs(s, nextStart, wordDict, visited)) {
                    return true;
                }
                visited[nextStart] = true;
            }
        }
        return false;
    }

    // BFS
    public boolean wordBreakOtherWay(String words, List<String> wordDict) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] visited = new boolean[words.length() + 1];

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int start = queue.poll();
                for (String word : wordDict) {
                    int nextStart = word.length() + start;
                    if (nextStart > words.length() || visited[nextStart]) continue;
                    if (word.indexOf(word, start) == start) {
                        if (nextStart == word.length()) return true;
                        queue.add(nextStart);
                        visited[nextStart] = true;
                    }
                }
            }
        }
        return false;
    }

    public boolean wordBreakThreeWay(String words, List<String> wordDict) {
        boolean[] dp = new boolean[words.length() + 1];
        HashMap<String, Boolean> map = new HashMap<>();
        for (String word : wordDict) {
            map.put(word, true);
        }
        dp[0] = true;

        for (int i = 1; i <= words.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                dp[i] = dp[j] && map.getOrDefault(words.substring(j, i), false);
                if (dp[i]) break;
            }
        }
        return dp[words.length()];
    }

}
