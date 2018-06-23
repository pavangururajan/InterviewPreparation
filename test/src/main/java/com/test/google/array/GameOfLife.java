package com.test.google.array;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int[][] result = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            result[i] = new int[board[i].length];
            for (int j = 0; j < board[i].length; j++) {
                int alive = 0;
                for (int k = Math.max(0, i-1); k <= Math.min(i+1, board.length-1); k++) {
                    for (int l = Math.max(0, j-1); l <= Math.min(j+1, board[k].length-1); l++) {
                        if (k == i && j == l) {
                            continue;
                        }
                        if (board[k][l] == 1) {
                            alive += 1;
                        }
                    }
                }
                if (alive < 2) {
                    result[i][j] = 0;
                } else if (alive > 3) {
                    result[i][j] = 0;
                } else if (alive == 3) {
                    result[i][j] = 1;
                } else if (board[i][j] == 1) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = result[i][j];
            }
        }
    }
}
