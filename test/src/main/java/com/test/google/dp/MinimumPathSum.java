package com.test.google.dp;

import java.util.Arrays;

/**
 * @author: pavan.g
 * created: 30/05/18.
 */
public class MinimumPathSum {

    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */

    public int minPathSum(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        if (grid.length == 1 && grid[0].length == 1) {
            return grid[0][0];
        }
        int[][] result = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(result[i], -1);
        }
        result[0][0] = grid[0][0];
        int i = 0, j = 0;
        while (i < grid.length || j < grid[0].length) {
            int nextRow = Math.min(grid.length - 1, i + 1);
            int nextCol = Math.min(grid[0].length - 1, j + 1);
            System.out.println("next: " + nextRow + " " + nextCol);
            fill(result, grid, nextRow, nextCol);
            print(result);
            i++;
            j++;
        }
        return result[grid.length - 1][grid[0].length - 1];
    }

    private void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("------------------------");
    }

    private void fill(int[][] sums, int[][] grid, int endRow, int endColumn) {
        for (int i = 0; i < endRow; i++) {
            if (sums[i][endColumn] == -1) {
                sums[i][endColumn] = grid[i][endColumn] + Math.min(
                 (i > 0 ? sums[i - 1][endColumn] : Integer.MAX_VALUE),
                 (endColumn > 0 ? sums[i][endColumn - 1] : Integer.MAX_VALUE)
                );
            }
        }
        for (int j = 0; j < endColumn; j++) {
            if (sums[endRow][j] == -1) {
                sums[endRow][j] = grid[endRow][j] + Math.min(
                 (endRow > 0 ? sums[endRow - 1][j] : Integer.MAX_VALUE),
                 (j > 0 ? sums[endRow][j - 1] : Integer.MAX_VALUE)
                );
            }
        }
        sums[endRow][endColumn] = grid[endRow][endColumn] +
                                   Math.min(
                                    (endRow > 0 ? sums[endRow - 1][endColumn] : Integer.MAX_VALUE),
                                    (endColumn > 0 ? sums[endRow][endColumn - 1] : Integer.MAX_VALUE));
    }

}
