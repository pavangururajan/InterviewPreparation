package com.test.careem;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: pavan.g
 * created: 14/07/18.
 */
public class TwoSumPairs {
    public int numberOfPairs(int[] a,  long k) {
        Map<Long, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : a) {
            if (map.containsKey((long)i)) {
                count++;
            } else {
                map.put(k-i, i);
            }
        }
        return count;
    }
}
