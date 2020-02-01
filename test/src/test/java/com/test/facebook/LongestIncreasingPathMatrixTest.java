package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingPathMatrixTest {

    @Test
    public void longestIncreasingPath() {
        int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
        LongestIncreasingPathMatrix longestIncreasingPathMatrix = new LongestIncreasingPathMatrix();
        System.out.println(longestIncreasingPathMatrix.longestIncreasingPath(matrix));
    }
}