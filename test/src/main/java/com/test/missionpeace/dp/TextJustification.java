package com.test.missionpeace.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: pavan.g
 * created: 14/07/18.
 */
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        helper(words, 0, result, new ArrayList<>(), maxWidth, maxWidth);
        return result;
    }

    private void helper(String[] words, int start, List<String> result, List<String> line, int remaining, int max) {
        if (start >= words.length) {
            result.add(pad(line, max));
            return;
        }
        if (words[start].length() > remaining) {
            result.add(pad(line, max));
            line = new ArrayList<>();
            remaining = max;
        }
        line.add(words[start]);
        helper(words, start + 1, result, line, remaining - words[start].length() - 1, max);
    }

    private String pad(List<String> line, int maxWidth) {
        int length = 0;
        for (String w : line) {
            length += w.length();
        }
        double totalSpaces = maxWidth - length;
        double spaces = Math.min(totalSpaces, Math.ceil(totalSpaces / (line.size() - 1)));
        StringBuilder result = new StringBuilder();
        int i = 0;
        String space = " ";
        while (totalSpaces > 0) {
            result.append(line.get(i++) + new String(new char[(int) Math.min(totalSpaces, spaces)]).replace("\0", space));
            totalSpaces -= spaces;
        }
        if (i < line.size())
            result.append(line.get(i));
        return result.toString();
    }
}
