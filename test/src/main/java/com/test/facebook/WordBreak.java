package com.test.facebook;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[][] dp = new boolean[s.length()][s.length()];
        return isDictSentence(s, 0, wordSet, dp);
    }

    private boolean isDictSentence(String s, int start, Set<String> wordSet, boolean[][] dp) {
        if (start == s.length()) return true;

        for (int i = start; i < s.length(); i++) {
            String substring = s.substring(start, i+1);
            if (wordSet.contains(substring) || dp[start][i]) {
                dp[start][i] = true;
                if (isDictSentence(s, i+1, wordSet, dp)) {
                    return true;
                }
            }
        }
        return false;
    }
}
