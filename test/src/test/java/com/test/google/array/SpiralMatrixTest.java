package com.test.google.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class SpiralMatrixTest {

    @Test
    public void spiralOrder() {
        //int[][] matrix = {{1,2,3,11},{4,5,6,12},{7,8,9,13}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8}, {9, 10, 11, 12}, {13,14,15,16}};
//        int[][] matrix = {{1},{5}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        System.out.println(spiralMatrix.spiralOrder(matrix));
    }
}