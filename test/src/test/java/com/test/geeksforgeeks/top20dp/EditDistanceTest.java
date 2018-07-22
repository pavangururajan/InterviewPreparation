package com.test.geeksforgeeks.top20dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class EditDistanceTest {

    @Test
    public void minEditDistance() {
        EditDistance editDistance = new EditDistance();
        System.out.println(editDistance.minEditDistance("sunday", "saturday"));
    }
}