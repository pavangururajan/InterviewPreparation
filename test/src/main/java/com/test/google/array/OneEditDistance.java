package com.test.google.array;

/**
 * @author: pavan.g
 * created: 21/05/18.
 */
public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        int edit = 0;

        if (s.length() == 0 && t.length() == 0) {
            return false;
        }
        if (s.equals(t)) {
            return false;
        }
        if (Math.abs(s.length() - t.length()) > 1) {
            return false;
        }

        char[] big = s.toCharArray();
        char[] small = t.toCharArray();
        if (s.length() < t.length()) {
            big = t.toCharArray();
            small = s.toCharArray();
        }
        int j = 0;
        int i = 0;
        for (i = 0; i < small.length && j < big.length; i++) {
            if (big[j] == small[i]) {
                j++;
                continue;
            } else if (j+1 < big.length) {
                if (big[j+1] == small[i]) {
                    edit += 1;
                    j += 1;
                } else if (i+1 < small.length && big[j+1] == small[i+1]) {
                    edit += 1;
                } else {
                    return false;
                }
            } else {
                edit += 1;
            }
            j++;
        }
        while (j < big.length) {
            edit++;
            j++;
        }
        while (i < small.length) {
            i++;
            edit++;
        }
        return  edit <= 1;
    }
}
