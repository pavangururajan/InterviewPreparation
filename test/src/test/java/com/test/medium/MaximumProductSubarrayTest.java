package com.test.medium;

import javafx.util.Pair;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 11/07/18.
 */
public class MaximumProductSubarrayTest {

    @Test
    public void maxProduct() {
        int[] input = new int[]{2,3,-2,4};
        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        System.out.println(maximumProductSubarray.maxProduct(input));
    }
}