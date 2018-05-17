package com.algorithm.leetcode.common;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices == null || prices.length < 2) {
            return maxProfit;
        }
        int minPrice = prices[0];       //记录最低价格
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {     //如果后面有比最低价格更低的,则替换
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {  //maxProfit只会出现自最低价格之后
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
