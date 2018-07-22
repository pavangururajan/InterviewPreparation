package com.test.missionpeace.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class ArrayAddition {
    int[] add(int[] a, int[] b) {
        int i = a.length -1;
        int j = b.length -1;
        List<Integer> result = new ArrayList<>();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = (i >= 0 ? a[i--] : 0) +
                       (j >= 0 ? b[j--] : 0) + carry;
            if (result.size() == 0) {
                result.add(sum % 10);
            } else {
                result.add(0, sum % 10);
            }
            carry = sum / 10;
        }
        if (carry == 1) {
            result.add(0, 1);
        }
        return result.stream().mapToInt(k->k).toArray();
    }
}
