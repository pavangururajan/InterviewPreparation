package com.test.missionpeace.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: pavan.g
 * created: 15/07/18.
 */
public class WordBreak {
    public List<String> wordBreak(String[] words, String sentence) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        helper(set, result, sentence);
        return result;
    }
    private boolean helper(Set<String> words, List<String> result, String sentence) {
        if (sentence.length() == 0) {
            return true;
        }
        for (int i = 0; i < sentence.length(); i++) {
            String currentWord = sentence.substring(0, i+1);
            if (words.contains(currentWord)) {
                result.add(currentWord);
                boolean success = helper(words, result, sentence.substring(i+1, sentence.length()));
                if (success) return true;
                result.remove(result.size()-1);
            }
        }
        return false;
    }
}
