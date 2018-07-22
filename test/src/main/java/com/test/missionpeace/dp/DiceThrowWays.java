package com.test.missionpeace.dp;

import org.junit.runner.JUnitCore;

/**
 * @author: pavan.g
 * created: 16/07/18.
 */
public class DiceThrowWays {
    //m - dice face values 1..m
    //n - no. of dice
    //sum - total sum
    public int diceThrowWays(int m, int n, int sum) {
        if (sum < m) return 0;
        int[][] dp = new int[sum+1][n+1];
        for (int i = 1; i <= m; i++) {
            dp[i][1] = 1;
        }
        for (int i = 1; i <= sum; i++) {
            for (int k = 1; k <= n; k++) {
                for (int j = 1; j <= m; j++) {
                    int remaining = i - j;
                    if (remaining < 1) continue;
                    dp[i][k] += dp[i-j][k-1];
                }
            }
        }
        return dp[sum][n];
    }
}
