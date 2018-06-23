package com.test.google.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class LengthOfLongestSubstringKDistinct {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        if (k == 0)
            return 0;
        int max = 0;
        int currentLength = 0;
        int start = 0;
        char[] inputArray = s.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            Integer freq = frequency.get(inputArray[i]);
            if (freq == null) {
                freq = Integer.valueOf(0);
            }
            frequency.put(inputArray[i], freq+1);
            currentLength += 1;
            if (frequency.size() > k) {
                do {
                    char ch = inputArray[start];
                    Integer f = frequency.get(ch);
                    f -= 1;
                    if (f <= 0) {
                        frequency.remove(ch);
                    } else {
                        frequency.put(ch, f);
                    }
                    start++;
                    currentLength--;
                } while (frequency.size() > k);
            }
            max = Math.max(max, currentLength);
        }
        return max;
    }
}
