package com.test.missionpeace.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: pavan.g
 * created: 25/07/18.
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), s);
        return result;
    }

    private void helper(List<List<String>> result, List<String> tempResult, String s) {
        if (s.length() == 0) {
            result.add(new ArrayList<>(tempResult));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String first = s.substring(0, i+1);
            if (isPalindrome(first)) {
                tempResult.add(first);
                helper(result, tempResult, s.substring(i+1, s.length()));
                tempResult.remove(tempResult.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
