package com.test.microsoft.dp;

import java.util.Arrays;

/**
 * @author: pavan.g
 * created: 08/06/18.
 */
public class BuySellStocks {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int[] minimum = new int[prices.length];
        int[] maximum = new int[prices.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            minimum[i] = min;
        }
        System.out.println(Arrays.toString(minimum));
        int max = Integer.MIN_VALUE;
        for (int j = prices.length-1; j >= 0; j--) {
            max = Math.max(prices[j], max);
            maximum[j] = max;
        }
        System.out.println(Arrays.toString(maximum));
        int profit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, maximum[i]-minimum[i]);
        }
        return profit >= 0 ? profit : 0;
    }
}
