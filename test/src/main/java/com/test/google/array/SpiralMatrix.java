package com.test.google.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: pavan.g
 * created: 17/05/18.
 */
public class SpiralMatrix {
    private int startRow;
    private int startCol;
    private int endRow;
    private int endCol;

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return result;
        }
        startRow = 0;
        endRow = matrix.length - 1;
        startCol = 0;
        endCol = matrix[0].length - 1;
        printMatrix(matrix, 0, 0, 0, 1, result);
        return result;
    }

    private void printMatrix(int[][] matrix, int i, int j, int rowAdd, int colAdd, List<Integer> result) {
        int count = 0;
        while (i >= startRow && i <= endRow && j >= startCol && j <= endCol) {
            result.add(matrix[i][j]);
            i += rowAdd;
            j += colAdd;
            count++;
        }
        i -= rowAdd;
        j -= colAdd;
        if (count == 0) {
            return;
        }
        int factor = 1;
        if (rowAdd == 1) {
            endCol--;
            factor = -1;
        }
        if (colAdd == 1) {
            startRow++;
            factor = 1;
        }
        if (rowAdd == -1) {
            startCol++;
            factor = -1;
        }
        if (colAdd == -1) {
            endRow--;
            factor = 1;
        }

        int temp = rowAdd;
        rowAdd = factor * colAdd;
        colAdd = factor * temp;
        i += rowAdd;
        j += colAdd;
        printMatrix(matrix, i, j, rowAdd, colAdd, result);
    }

    private void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
