package com.leetcode.array;

public class MaxProfitII {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices == null || prices.length <= 2) return maxProfit;
        int minPrice = prices[0];
        for (int price : prices) {
            if (price < minPrice) {
                // 更新minPrice
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
