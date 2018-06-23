package com.test.google.array;

/**
 * @author: pavan.g
 * created: 22/05/18.
 */
public class ImageSmoothener {
    public int[][] imageSmoother(int[][] M) {
        int[][] result = new int[M.length][];
        for (int i = 0; i < M.length; i++) {
            result[i] = new int[M[i].length];
            for (int j = 0; j < M[i].length; j++) {
                double totalSet = 0;
                double total = 0;
                for (int k = Math.max(0, i - 1); k <= Math.min(i + 1, M.length - 1); k++) {
                    for (int l = Math.max(0, j - 1); l <= Math.min(j + 1, M[i].length - 1); l++) {
                        total += 1;
                        totalSet += M[k][l];
                    }
                }
                result[i][j] = (int) Math.floor(totalSet / total);
            }
        }
        return result;
    }
}
