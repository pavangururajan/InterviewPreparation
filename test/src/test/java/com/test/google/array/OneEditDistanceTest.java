package com.test.google.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 21/05/18.
 */
public class OneEditDistanceTest {

    @Test
    public void isOneEditDistance() {
        OneEditDistance oneEditDistance = new OneEditDistance();
        System.out.println(oneEditDistance.isOneEditDistance("ab", "ba"));
        System.out.println(oneEditDistance.isOneEditDistance("ab", "cab"));
        System.out.println(oneEditDistance.isOneEditDistance("daba", "cab"));
        System.out.println(oneEditDistance.isOneEditDistance("daba", "ab"));
        System.out.println(oneEditDistance.isOneEditDistance("daba", "caba"));
        System.out.println(oneEditDistance.isOneEditDistance("a", "A"));
    }
}