package com.test.facebook;

import java.util.Arrays;

public class RangeSumQuery {
    int[][] sum;
    int[][] matrix;
    public RangeSumQuery(int[][] matrix) {
        this.matrix = matrix;
        sum = new int[matrix.length][matrix[0].length];
        populateSum();
    }

    private void populateSum() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum[i][j] += i > 0 ? sum[i-1][j] : 0;
                sum[i][j] += j > 0 ? sum[i][j-1] : 0;
                sum[i][j] -= i > 0 && j > 0 ? sum[i-1][j-1] : 0;
                sum[i][j] += matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(sum[i]));
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int currentSum = sum[row2][col2];
        currentSum += row1 > 0 && col1 > 0 ? sum[row1-1][col1-1] : 0;
        currentSum -= row1 > 0 ? sum[row1-1][col2] : 0;
        currentSum -= col1 > 0 ? sum[row2][col1-1] : 0;
        return currentSum;
    }
}
