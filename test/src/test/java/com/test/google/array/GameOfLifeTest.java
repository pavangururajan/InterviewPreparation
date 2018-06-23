package com.test.google.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class GameOfLifeTest {

    @Test
    public void gameOfLife() {
        int[][] board = {{1,0,1}, {0,0,1},{1,0,0}};
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.gameOfLife(board);
        System.out.println(arrayToString(board));
    }

    public String arrayToString(int[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<matrix.length; i++) {
            stringBuilder.append(Arrays.toString(matrix[i]));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}