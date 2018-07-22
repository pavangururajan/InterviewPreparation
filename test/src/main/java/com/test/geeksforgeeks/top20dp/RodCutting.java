package com.test.geeksforgeeks.top20dp;

/**
 * @author: pavan.g
 * created: 02/07/18.
 */
public class RodCutting {
    public int maxValue(int[] value) {
        int[] dp = new int[value.length+1];
        dp[0] = 0;
        for (int i = 1; i <= value.length; i++) {
            int max = value[i-1];
            for (int j = 0; j < i; j++) {
                max = Math.max(max, dp[j]+dp[i-j]);
            }
            dp[i] = max;
        }
        return dp[value.length];
    }
}
