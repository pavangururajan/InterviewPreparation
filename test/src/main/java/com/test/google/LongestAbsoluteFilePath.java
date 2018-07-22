package com.test.google;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        String[] splits = input.split("\n");
        List<Integer> lengths = new ArrayList<>();
        lengths.add(splits[0].length());
        int max = 0;
        for (int i = 1; i < splits.length; i++ ) {
            String split = splits[i];
            int level = split.lastIndexOf("\t") + 1;
            int currentLength = lengths.get(level-1) + split.length() - level + 1;
            if (lengths.size() <= level) {
                lengths.add(currentLength);
            } else {
                lengths.add(level, currentLength);
            }
            if (split.contains(".")) {
                max = Math.max(max, currentLength);
            }
        }
        return max;
    }
}
