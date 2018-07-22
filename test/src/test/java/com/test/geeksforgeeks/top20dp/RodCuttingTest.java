package com.test.geeksforgeeks.top20dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 02/07/18.
 */
public class RodCuttingTest {

    @Test
    public void maxValue() {
        RodCutting rodCutting = new RodCutting();
        int arr[] = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(rodCutting.maxValue(arr));
    }
}