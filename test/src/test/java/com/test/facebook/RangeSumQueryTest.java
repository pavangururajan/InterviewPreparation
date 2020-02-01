package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangeSumQueryTest {

    @Test
    public void sumRegion() {
        /*
        ["NumMatrix","sumRegion","sumRegion","sumRegion"]
[[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],[2,1,4,3],[1,1,2,2],[1,2,2,4]]
         */
        int[][] matrix = new int[][] {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        RangeSumQuery rangeSumQuery = new RangeSumQuery(matrix);
        System.out.println(rangeSumQuery.sumRegion(2,1,4,3));
    }
}