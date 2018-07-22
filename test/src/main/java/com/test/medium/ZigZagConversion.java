package com.test.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: pavan.g
 * created: 05/07/18.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        Map<Boolean, Stack<String>> map = new HashMap<>();
        map.put(true, new Stack<>());
        map.put(false, new Stack<>());
        for (int i = 0; i < numRows; i++) {
            map.get(true).push("");
        }
        boolean zig = true;
        for (int i = 0; i < s.length(); i++) {
            String a = map.get(zig).pop();
            a = a + s.charAt(i);
            if (map.get(zig).isEmpty()) {
                zig = !zig;
            }
            map.get(!zig).push(a);
        }
        while (!map.get(false).isEmpty()) {
            map.get(true).push(map.get(false).pop());
        }
        StringBuilder result = new StringBuilder();
        while (!map.get(true).isEmpty()) {
            result.append(map.get(true).pop());
        }
        return result.toString();
    }
}
