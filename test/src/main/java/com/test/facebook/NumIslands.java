package com.test.facebook;

import java.util.Arrays;

/**
 * @author: pavan.g
 * created: 01/06/18.
 */
public class NumIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int[][] downRight = new int[grid.length][grid[0].length];
        int[][] upLeft = new int[grid.length][grid[0].length];
        populate(downRight, grid, 0, grid.length-1, 1);
        populate(upLeft, grid, 0, grid.length-1, -1);
        print(downRight);
        print(upLeft);
        Integer islands = Integer.MAX_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                islands = Math.min(downRight[i][j], upLeft[i][j]);
            }
        }
        if (islands >= Integer.MAX_VALUE) islands = 0;
        return islands;
    }

    private void populate(int[][] a, char[][] grid, int start, int end, int increment) {
        int islands = 0;
        for (int i = start; i >= start && i <= end; i += increment) {
            for (int j = start; j >= start && j <= end; j += increment) {
                if (grid[i][j] == '1') {
                    if ((i > start && i < end && grid[i+increment][j] == '1') ||
                         (j > start && j < end && grid[i][j+increment] == '1')) {
                        //do nothing
                    } else {
                        islands += 1;
                    }
                    a[i][j] = islands;
                }
            }
        }
    }

    private void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-----------------------------------");
    }
}
