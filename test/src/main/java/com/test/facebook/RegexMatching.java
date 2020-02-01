package com.test.facebook;

import java.util.Arrays;

public class RegexMatching {

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];

        dp[0][0] = true;
        for (int i = 1; i < p.length(); i++) {
            if (p.charAt(i-1) == '*' && i > 1 && dp[0][i-2])
                dp[0][i] = true;
            dp[i][0] = false;
        }

        for (int i = 1; i < s.length()+1; i++) {
            for (int j = 1; j < p.length()+1; j++) {
                char currentChar = s.charAt(i-1);
                char currentPattern = p.charAt(j-1);
                char previousPattern = j > 1 ? p.charAt(j-2) : ' ' ;
                if (currentChar == currentPattern || currentPattern == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                if (currentPattern == '*') {
                    if (currentChar == previousPattern ||  previousPattern == '.') {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
            for (int k=0;k<=s.length();k++) {
                System.out.println(Arrays.toString(dp[k]));
            }
            System.out.println("-----------------------------");
        }
        return dp[s.length()][p.length()];
    }

}
