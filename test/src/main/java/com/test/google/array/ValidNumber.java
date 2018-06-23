package com.test.google.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: pavan.g
 * created: 22/05/18.
 */
public class ValidNumber {
    Set<Character> validChars = new HashSet<Character>(Arrays.asList('x', 'l', 'u', 's', '+', '-', 'e', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
    Set<Character> validHexChars = new HashSet<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));

    public boolean isNumber(String s) {
        char[] input = s.trim().toLowerCase().toCharArray();
        if (input.length == 0) {
            return false;
        }
        boolean dotAdded = false;
        boolean eAdded = false;
        boolean isHex = false;
        for (int i = 0; i < input.length; i++) {
            if (!validChars.contains(input[i])) {
                return false;
            }
            if (input[i] == 'x') {
                if ((i == 1 && input[i - 1] == '0') ||
                     (i == 2 && input[i - 1] == '0' && (input[i - 2] == '+' || input[i - 2] == '-'))) {
                    isHex = true;
                    validChars.addAll(validHexChars);
                } else {
                    return false;
                }
            }
            if (input[i] == '+' || input[i] == '-') {
                if (!isHex && i < input.length -1 && ((input[i+1] >= '0' && input[i+1] <= '9') || input[i+1] == '.') && (i == 0 || (input[i - 1] == 'e') && i < input.length - 1)) {
                    continue;
                } else {
                    return false;
                }
            }
            if (input[i] == '.') {
                if (dotAdded || isHex || input.length == 1 || (i == input.length -1 && (input[i-1] == 'e' || input[i-1] == '-' || input[i-1] == '+' || input[i-1] == 'x'))||(i != input.length - 1 && (input[i + 1] < '0' || input[i + 1] > '9'))) {
                    return false;
                }
                dotAdded = true;
            }
            if (input[i] == 'e') {
                if (i == 0 || i == input.length - 1 || (input[i - 1] == '-' || input[i - 1] == '+') || (eAdded && !isHex)) {
                    return false;
                }
                eAdded = true;
                dotAdded = false;
            }
            if (input[i] == 'l' || input[i] == 'u' || input[i] == 's') {
                if (i != input.length - 1 || dotAdded || eAdded) {
                    return false;
                }
            }
        }
        return true;
    }
}
