package com.test.google.process;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 15/05/18.
 */
public class NextClosestTimeTest {

    @Test
    public void nextClosestTime() {
        NextClosestTime nextClosestTime = new NextClosestTime();
        System.out.println(nextClosestTime.nextClosestTime("23:59"));
        System.out.println(nextClosestTime.nextClosestTime("19:34"));
    }
}