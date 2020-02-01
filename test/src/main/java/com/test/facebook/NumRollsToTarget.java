package com.test.facebook;

public class NumRollsToTarget {
    public long numRollsToTarget(int d, int f, int target) {
        long dp[][] = new long[Math.max(target+1, f+1)][d+1];

        for (int i = 1; i <= f; i++) {
            dp[i][1] = 1;
            dp[i][0] = 0;
        }

        for (int sum = 2; sum <= target; sum++) {
            for (int j = 2; j <= d; j++) {
                for (int k = 1; k <= f; k++) {
                    if (sum-k <= 0) {
                        continue;
                    }
                    dp[sum][j] += dp[sum-k][j-1];
                }
            }
        }
        return dp[target][d];
    }
}
