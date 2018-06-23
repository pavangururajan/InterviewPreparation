package com.test;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: pavan.g
 * created: 13/05/18.
 */
public class FindAndReplaceString {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        StringBuilder outputbuilder = new StringBuilder();
        char[] charArray = S.toCharArray();
        Map<Integer, Pair<String, String>> replaceMap = buildMap(indexes, sources, targets);
        for (int i = 0; i < charArray.length; i++) {
            if (replaceMap.containsKey(i)) {
                Pair<String, String> pair = replaceMap.get(i);
                if (S.startsWith(pair.getKey(), i)) {
                    outputbuilder.append(pair.getValue());
                    i += pair.getKey().length() - 1;
                    continue;
                }
            }
            outputbuilder.append(charArray[i]);
        }
        return outputbuilder.toString();
    }

    private Map<Integer, Pair<String, String>> buildMap(int[] indexes, String[] sources, String[] targets) {
        Map<Integer, Pair<String, String>> map = new HashMap<Integer, Pair<String, String>>();
        for (int i = 0; i < indexes.length; i++) {
            map.put(indexes[i], new Pair<String, String>(sources[i], targets[i]));
        }
        return map;
    }
}
