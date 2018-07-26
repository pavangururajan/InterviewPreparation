package com.test.missionpeace.dp;

/**
 * @author: pavan.g
 * created: 22/07/18.
 */
public class LongestPalindromicSubsequence {
    public int lps(String a) {
        int[][] dp = new int[a.length()][a.length()];
        for (int i = 0; i < a.length(); i++) {
            dp[i][i] = 1;
        }

        for (int window = 2; window <= a.length(); window++) {
            for (int i = 0; i <= a.length() - window; i++) {
                int end = i + window - 1;
                if (a.charAt(i) == a.charAt(end)) {
                    if (i + 1 == end) {
                        dp[i][end] = 2;
                    } else {
                        dp[i][end] = 2 + dp[i + 1][end - 1];
                    }
                } else {
                    dp[i][end] = Math.max(dp[i + 1][end], dp[i][end - 1]);
                }
            }
        }
        return dp[0][a.length() - 1];
    }

    public int lpsRecursive(String a) {
        return helper(a, 0, a.length()-1);
    }

    private int helper(String a, int start, int end) {
        if (start > end) return 0;
        if (start == end) return 1;
        if (a.charAt(start) == a.charAt(end)) {
            return 2 + helper(a, start+1, end-1);
        }
        return Math.max(helper(a, start, end-1), helper(a, start+1, end));
    }
}
