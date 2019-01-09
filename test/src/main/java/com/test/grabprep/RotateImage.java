package com.test.grabprep;

import java.util.Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if (n < 1) {
            return;
        }
        int m = matrix[0].length;
        if (n != m) {
            return;
        }
        for (int i = 0; i < Math.ceil(n/2); i++) {
            for (int j = i; j < n-1-i; j++) {
                System.out.println("Doing row column " + i + " " + j);
                int currI = i;
                int currJ = j;
                int current = matrix[i][j];
                do {
                    int tempj = currJ;
                    currJ = n-1-currI;
                    currI = tempj;
                    int temp = matrix[currI][currJ];
                    matrix[currI][currJ] = current;
                    current = temp;
                } while (!(currI == i && currJ == j));
            }
        }

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
