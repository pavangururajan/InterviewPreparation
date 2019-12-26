package com.test.facebook;

import java.util.*;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length != matrix[0].length) {
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("======");
        for (int i = 0, l = matrix.length - 1; i < l; i++, l--) {
            int m = i + 1, n = l - 1;
            for (int j = i + 1, k = l - 1; j < l && k > i; j++, k--) {
                int temp1 = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = matrix[l][k];
                matrix[l][k] = matrix[j][l];
                matrix[j][l] = temp1;
            }
        }

        for (int i = 0, l = matrix.length - 1; i < l; i++, l--) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[l][i];
            matrix[l][i] = matrix[l][l];
            matrix[l][l] = matrix[i][l];
            matrix[i][l] = temp;
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
