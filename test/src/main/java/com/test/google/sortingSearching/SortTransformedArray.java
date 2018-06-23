package com.test.google.sortingSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: pavan.g
 * created: 28/05/18.
 */
public class SortTransformedArray {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        double cusp = -(double)b/(2*a);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> current = left;
        Integer previous = null;
        System.out.println(cusp);
        for (int i = 0; i < nums.length; i++) {
            int value = (int) (a * Math.pow(nums[i], 2) + b * nums[i] + c);
            if (cusp < nums[i]) {
                current = right;
            }
            current.add(value);
        }
        if (a < 0) {
            Collections.reverse(right);
        } else {
            Collections.reverse(left);
        }
        int[] finalResult = new int[nums.length];
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < left.size() || j < right.size()) {
            if (i < left.size() && (j >= right.size() || left.get(i) < right.get(j))) {
                finalResult[count] = left.get(i);
                i++;
            } else {
                finalResult[count] = right.get(j);
                j++;
            }
            count++;
        }
        return finalResult;
    }

    private class IntervalComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }
}
