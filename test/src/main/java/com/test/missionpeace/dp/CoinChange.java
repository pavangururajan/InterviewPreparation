package com.test.missionpeace.dp;

/**
 * @author: pavan.g
 * created: 15/07/18.
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int i=0; i < coins.length; i++) {
            for(int j=coins[i]; j <= amount; j++) {
                dp[j] += dp[j-coins[i]];
            }
        }
        return dp[amount];
    }

    public int coinMinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int v : coins) {
                if (v > i) continue;
                if (dp[i-v] >= 0)
                    dp[i] = Math.min(dp[i], 1 + dp[i-v]);
            }
            if (dp[i] == Integer.MAX_VALUE) dp[i] = -1;
        }
        return dp[amount];
    }
}
