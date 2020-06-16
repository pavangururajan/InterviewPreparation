package com.test.facebook;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DiagonalSortMatrixTest {

    @Test
    public void diagonalSort() {
        DiagonalSortMatrix diagonalSortMatrix = new DiagonalSortMatrix();
//        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int[][] mat = {{37}};
        diagonalSortMatrix.diagonalSort(mat);
        for (int i = 0 ; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}