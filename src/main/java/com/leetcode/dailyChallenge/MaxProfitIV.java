package com.leetcode.dailyChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MaxProfitIV {

    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        // 每次买入卖出都需要2天，当k >= prices.length / 2转化为无限次交易
        if (k >= prices.length / 2) {
            int dp0 = 0;
            int dp1 = -prices[0];
            for (int i = 1; i < prices.length; i++) {
                dp0 = Math.max(dp0, dp1 + prices[i]);
                dp1 = Math.max(dp1, dp0 - prices[i]);
            }
            return Math.max(dp0, dp1);
        }
        Map<Key, Integer> cache = new HashMap<>();
        return dfs(cache, 0, 0, 0, k, prices);
    }

    // dfs + cache time limit
    private int dfs(Map<Key, Integer> cache, int index, int status, int count, int k, int[] prices) {
        Key key = new Key(index, status, count);
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        if (index == prices.length || count == k) return 0;
        int a, b = 0, c = 0;
        a = dfs(cache, index + 1, status, count, k, prices);
        if (status == 1) {
            b = dfs(cache, index + 1, 0, count + 1, k, prices) + prices[index];
        } else {
            c = dfs(cache, index + 1, 1, count, k, prices) - prices[index];
        }
        return Math.max(Math.max(a, b), c);
    }

    private class Key {
        private final int index;
        private final int status;
        private final int count;

        Key(int index, int status, int count) {
            this.index = index;
            this.status = status;
            this.count = count;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return index == key.index &&
                    status == key.status &&
                    count == key.count;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index, status, count);
        }
    }

    // https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/solution/si-chong-jie-fa-tu-jie-188mai-mai-gu-piao-de-zui-j/
    public int maxProfitOtherWay(int k, int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        // 每次买入卖出都需要2天，当k >= prices.length / 2转化为无限次交易，无限次交易只要有利润就加上
        if (k > prices.length / 2) {
            int result = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    result += prices[i] - prices[i - 1];
                }
            }
            return result;
        }
        int[][] dp = new int[k + 1][2];
        for (int i = 0; i < k; i++) {
            dp[i][0] = 0;
            dp[i][1] -= prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = k; j > 0; j--) {
                dp[j - 1][1] = Math.max(dp[j - 1][1], dp[j - 1][0] - prices[i]);
                dp[j][0] = Math.max(dp[j][0], dp[j - 1][1] + prices[i]);
            }
        }

        return dp[k][0];
    }
}
