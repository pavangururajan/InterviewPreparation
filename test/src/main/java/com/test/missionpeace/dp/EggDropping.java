package com.test.missionpeace.dp;

/**
 * @author: pavan.g
 * created: 17/07/18.
 */
public class EggDropping {
    public int minEggDrops(int eggs, int floors) {
        int[][] dp = new int[eggs + 1][floors + 1];
        for (int i = 0; i <= eggs; i++) {
            for (int j = 0; j <= floors; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (i == 1) {
                    dp[i][j] = j;
                    continue;
                }
                if (j == 1) {
                    dp[i][j] = 1;
                    continue;
                }
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 2; x <= j; x++) {
                    int ways = 1 + Math.max(dp[i][x], dp[i - 1][j - x]);
                    if (ways < dp[i][j]) {
                        dp[i][j] = ways;
                    }
                }
            }
        }
        return dp[eggs][floors];
    }
}
