package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateMatrixTest {

    @Test
    public void rotate() {
        RotateMatrix rotateMatrix = new RotateMatrix();

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        rotateMatrix.rotate(matrix);
    }

    @Test
    public void rotate4x4() {
        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotateMatrix.rotate(matrix);
    }
}