package com.test.facebook;

import java.util.Arrays;
import java.util.Stack;

public class LongestIncreasingPathMatrix {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        Stack<Index> indexStack = new Stack<>();
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                indexStack.push(new Index(i, j, matrix.length, matrix[0].length, 0));
                dp[i][j] = -1;
            }
        }
        int[][] directions = new int[][]{{1,0}, {-1, 0}, {0,1}, {0,-1}};
        int max = -1;

        while (!indexStack.empty()) {
            Index currentIndex = indexStack.pop();
            if (currentIndex.steps > dp[currentIndex.i][currentIndex.j]) {
                max = Math.max(currentIndex.steps, max);
                dp[currentIndex.i][currentIndex.j] = currentIndex.steps;
                for (int[] dir : directions) {
                    Index newIndex = new Index(currentIndex.i+dir[0], currentIndex.j+dir[1], matrix.length, matrix[0].length,
                                                dp[currentIndex.i][currentIndex.j]+1);
                    if (newIndex.isValid() && matrix[newIndex.i][newIndex.j] > matrix[currentIndex.i][currentIndex.j]) indexStack.push(newIndex);
                }
            }
//            for (int i = 0; i < dp.length; i++) {
//                System.out.println(Arrays.toString(dp[i]));
//            }
//            System.out.println("---------------------------");
        }
        return max+1;
    }

    public static class Index {

        public int i;
        public int j;
        public int rows;
        public int cols;
        public int steps;

        public Index(int i, int j, int rows, int cols, int steps) {
            this.i = i;
            this.j = j;
            this.rows = rows;
            this.cols = cols;
            this.steps = steps;
        }

        public boolean isValid() {
            return i >= 0 && j >= 0 && i < rows && j < cols;
        }
    }
}
