package com.test.careem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: pavan.g
 * created: 14/07/18.
 */
public class CutSticks {
    public int[] cutSticks(int[] lengths) {
        Arrays.sort(lengths);
        List<Integer> result = new ArrayList<>();
        while (lengths.length > 0) {
            result.add(lengths.length);
            int lowest = lengths[0];
            int i = 0;
            while (i < lengths.length && lengths[i] == lowest) i++;
            int[] newArray = new int[lengths.length-i];
            int j = 0;
            while (i < lengths.length) {
                newArray[j] = lengths[i] - lowest;
                i++;
                j++;
            }
            lengths = newArray;
        }
        int[] resultArray = new int[result.size()];
        for (int i=0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
