package com.test.missionpeace.dp;

import java.util.Arrays;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
 * @author: pavan.g
 * created: 21/07/18.
 */
public class Knapsack01 {
    public int getMaxValueDP(int W, int[] w, int[] v) {
        int[][] dp = new int[w.length+1][W+1];
        for (int i = 0; i <= W; i++) {
            dp[0][i] = 0;
        }
        for (int i=0; i <= w.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= w.length; i++) {
            for (int j = 1; j <= W; j++) {
                if (j < w[i-1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    int first = v[i - 1] + dp[i - 1][W - w[i - 1]];
                    int second = dp[i-1][j];
                    dp[i][j] = Math.max(v[i - 1] + dp[i - 1][j - w[i - 1]], dp[i - 1][j]);
                }
            }
        }
        return dp[w.length][W];
    }

    public int knapsackRecurse(int W, int[] w, int[] v) {
        return helper(W, w, v, w.length-1);
    }

    private int helper(int W, int[] w, int[] v, int n) {
        if (n == 0 || W == 0) return 0;
        if (w[n] < W) return 0;
        return Math.max(v[n] + helper(W-w[n-1], w, v, n-1), helper(W, w, v, n-1));
    }
}
