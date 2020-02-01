package com.test.contest;

import java.util.ArrayList;
import java.util.List;

public class VerticalString {
    public List<String> printVertically(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        String regex = "\\s+$";
        String[] splitStrings = s.split(" ");
        int maxLen = -1;
        for (String str : splitStrings) {
            maxLen = Math.max(maxLen, str.length());
        }
        for (int i = 0; i < maxLen; i++) {
            StringBuilder builder = new StringBuilder();
            for (String str : splitStrings) {
                if (i < str.length()) {
                    builder.append(str.charAt(i));
                } else {
                    builder.append(" ");
                }
            }
            result.add(builder.toString().replaceAll(regex, ""));
        }
        return result;
    }
}
