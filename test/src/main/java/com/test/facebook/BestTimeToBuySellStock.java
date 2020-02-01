package com.test.facebook;

import java.util.Arrays;

public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices, int fee) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int[][] dp = new int[prices.length][prices.length];
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int difference = prices[j] - prices[i] - fee;
                dp[i][j] = Math.max(difference, 0);
                if (i != 0) {
                    dp[i][j] = Math.max(dp[i-1][i-1] + dp[i][j], dp[i-1][j]);
                }
            }
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[prices.length-1][prices.length-1];
    }
}
