package com.test.google.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<Integer>();
        int carry = 1;
        for (int i = digits.length-1; i >= 0; i--) {
            int sum = digits[i] + carry;
            int digit = sum % 10;
            carry = sum / 10;
            result.add(0, digit);
        }
        if (carry != 0) {
            result.add(0, carry);
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
