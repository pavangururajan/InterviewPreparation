package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrowsAndBallonsTest {

    @Test
    public void findMinArrowShots() {
        ArrowsAndBallons arrowsAndBallons = new ArrowsAndBallons();
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(arrowsAndBallons.findMinArrowShots(points));
    }
}