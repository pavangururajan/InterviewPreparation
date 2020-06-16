package com.test.facebook;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KClosestPointsTest {

    @Test
    public void kClosest() {
        int[][] points = {{1,3},{-2,2}};
        KClosestPoints kClosestPoints = new KClosestPoints();
        int k = 1;
        int[][] result = kClosestPoints.kClosest(points, k);
        for (int i = 0; i < k; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}