package com.test.missionpeace.dp;

/**
 * https://www.geeksforgeeks.org/dynamic-programming-set-8-matrix-chain-multiplication/
 * @author: pavan.g
 * created: 24/07/18.
 */
public class MatrixChainMultiplication {
    public int minCost(int[] lengths) {
        int[][] dp  = new int[lengths.length][lengths.length];
        for (int i = 1; i < lengths.length; i++) {
            dp[i][i] = 0;
        }

        for (int window = 2; window < lengths.length; window++) {
            for (int i = 1; i <= lengths.length-window; i++) {
                int end = i + window - 1;
                if (end == lengths.length) continue;
                dp[i][end] = Integer.MAX_VALUE;
                for (int k = i; k < end; k++) {
                    int cost = dp[i][k] + dp[k+1][end] + lengths[i-1]*lengths[k]*lengths[end];
                    if (cost < dp[i][end]) {
                        dp[i][end] = cost;
                    }
                }
            }
        }
        return dp[1][lengths.length-1];
    }
}
