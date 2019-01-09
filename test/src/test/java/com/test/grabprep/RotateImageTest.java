package com.test.grabprep;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateImageTest {

    @Test
    public void rotate() {
        int[][] matrix = new int[][]{{1,2}, {4,5}};
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(matrix);
    }
}