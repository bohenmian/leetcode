package com.leetcode.array;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price >= minPrice) {
                maxProfit += price - minPrice;
            }
            minPrice = price;
        }
        return maxProfit;
    }

    public int maxProfitInOtherWay(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
