package com.test.google.sortingSearching;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 28/05/18.
 */
public class SortTransformedArrayTest {

    @Test
    public void sortTransformedArray() {
        int[] nums = {-4, -2, 2, 4};
        int a = 1, b = 3, c = 5;
        SortTransformedArray solution = new SortTransformedArray();
        int[] result = solution.sortTransformedArray(nums, a, b, c);
        System.out.println(Arrays.toString(result));
    }
}