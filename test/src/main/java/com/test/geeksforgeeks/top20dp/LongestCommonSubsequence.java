package com.test.geeksforgeeks.top20dp;

/**
 * @author: pavan.g
 * created: 01/07/18.
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[a.length()][b.length()];
    }

    public int lcsRecursive(String a, String b) {
        return helper(a, b, a.length()-1, b.length()-1);
    }

    private int helper(String a, String b, int m, int n) {
        if (m < 0 || n < 0) {
            return 0;
        }
        if (a.charAt(m) == b.charAt(n)) {
            return 1 + helper(a, b, m-1, n-1);
        }
        return Math.max(helper(a, b, m-1, n), helper(a, b, m, n-1));
    }
}
