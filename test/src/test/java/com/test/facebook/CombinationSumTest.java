package com.test.facebook;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumTest {

    @Test
    public void combinationSum() {
        CombinationSum combinationSum = new CombinationSum();
        int[] num = new int[] {1, 1, 1, 1, 3, 2, 3};
        List<List<Integer>> result = combinationSum.combinationSum(num, 4);
        for (List<Integer> sublist : result) {
            System.out.println(Arrays.toString(sublist.toArray()));
        }
    }
}