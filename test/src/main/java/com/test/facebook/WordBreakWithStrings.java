package com.test.facebook;

import java.util.*;

public class WordBreakWithStrings {
    public List<String> wordBreak(String s, List<String> wordDict) {
        if (s == null || wordDict == null || wordDict.size() == 0) {
            return new ArrayList<>();
        }

        Set<String> wordSet = new HashSet<String>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        Map<Integer, List<String>> results = new HashMap<>();
        dp[0] = true;

        List<String> zeroSet = new ArrayList<>();
        results.put(0, zeroSet);
        zeroSet.add("");

        for (int i = 1; i <= s.length(); i++) {
            results.put(i, new ArrayList<>());
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    cartesianProduct(results.get(j), s.substring(j, i), results.get(i));
                }
            }
        }
        return results.getOrDefault(s.length(), new ArrayList<>());
    }

    private void cartesianProduct(List<String> a, String b, List<String> result) {
        if (a == null || b == null || a.size() == 0 || b.length() == 0) return;
        Set<String> newResults = new HashSet<>();
        for (String itemA : a) {
            StringBuilder resultBuilder = new StringBuilder();
            newResults.add(resultBuilder.append(itemA).append(' ').append(b).toString().trim());
        }
        result.addAll(newResults);
    }
}
