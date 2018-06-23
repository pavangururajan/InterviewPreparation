package com.test.google.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: pavan.g
 * created: 22/05/18.
 */
public class ValidParantheses {
    Map<Character, Character> paraDict = new HashMap<Character, Character>();
    public boolean isValid(String s) {
        paraDict.put('{', '}');
        paraDict.put('(', ')');
        paraDict.put('[', ']');
        char[] input = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (paraDict.containsKey(input[i])) {
                stack.push(input[i]);
            } else if (paraDict.containsValue(input[i])) {
                if (stack.size() == 0) {
                    return false;
                }
                char element = stack.pop();
                if (input[i] != paraDict.get(element)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
