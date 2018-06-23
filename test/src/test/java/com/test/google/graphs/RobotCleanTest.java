package com.test.google.graphs;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 26/05/18.
 */
public class RobotCleanTest {
    @Test
    public void testIntEquals() {
        Integer[] i = new Integer[] {1, 2};
        Integer[] j = new Integer[] {1, 2};
        System.out.println(Arrays.equals(i, j));
    }

}