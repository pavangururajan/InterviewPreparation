package com.test.google.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class PlusOneTest {

    @Test
    public void plusOne() {
        int[] number = {9, 9, 9};
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(number)));
    }
}