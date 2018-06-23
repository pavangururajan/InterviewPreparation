package com.test.google.array;

/**
 * @author: pavan.g
 * created: 21/05/18.
 */
public class isPalindrome {
    char[][] alphanumericRanges = {{'0', '9'}, {'a', 'z'}, {'A', 'Z'}};
    public boolean isPalindrome(String s) {
        char[] input = s.toLowerCase().toCharArray();
        int j = s.length()-1;
        int i = 0;
        while (i < input.length && j >= 0){
            if (!isAlphanumeric(input[i])) {
                i++;
                continue;
            }
            if (!isAlphanumeric(input[j])) {
                j--;
                continue;
            }
            if (input[i] != input[j]) {
                return false;
            }
            i++;
            j--;
        }
        while (i < input.length) {
            if (!isAlphanumeric(input[i])) {
                i++;
            }
        }
        while (j >= 0) {
            if (!isAlphanumeric(input[j])) {
                j--;
            }
        }
        if (i != j + 1 + s.length()) {
            return false;
        }
        return true;
    }

    private boolean isAlphanumeric(char a) {
        boolean success = false;
        for (int i = 0; i< alphanumericRanges.length;i++) {
            success = success || a >= alphanumericRanges[i][0] && a <= alphanumericRanges[i][1];
        }
        return success;
    }
}
