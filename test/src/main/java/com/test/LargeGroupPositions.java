package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: pavan.g
 * created: 09/05/18.
 */
public class LargeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (S == null || S.equals("")) {
            return result;
        }
        char[] input = S.toCharArray();
        int runningLength = 1;
        int startingIndex = 0;
        char currentChar = input[0];
        for (int i = 0; i < input.length ; i++) {
            char ch = input[i];
            if (ch == currentChar) {
                runningLength += 1;
            } else {
                if (runningLength >= 3) {
                    List<Integer> entry = new ArrayList<Integer>();
                    entry.add(startingIndex);
                    entry.add(i-1);
                    result.add(entry);
                }
                runningLength = 1;
                startingIndex = i;
                currentChar = ch;
            }
        }
        if (runningLength >= 3) {
            List<Integer> entry = new ArrayList<Integer>();
            entry.add(startingIndex);
            entry.add(input.length-1);
            result.add(entry);
        }
        return result;
    }
}
