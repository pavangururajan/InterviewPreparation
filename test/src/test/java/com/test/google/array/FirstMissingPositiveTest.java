package com.test.google.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 23/05/18.
 */
public class FirstMissingPositiveTest {

    @Test
    public void firstMissingPositive() {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        System.out.println(firstMissingPositive.firstMissingPositive(new int[] {1,2,0}));
    }
}