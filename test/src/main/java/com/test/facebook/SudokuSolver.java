package com.test.facebook;

import com.google.common.collect.Sets;

import java.util.*;

public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowPossibilities = new HashMap<>();
        Map<Integer, Set<Character>> columnPossibilities = new HashMap<>();
        Map<Integer, Set<Character>> squarePossibilities = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            Set<Character> rowP = new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
            Set<Character> colP = new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
            Set<Character> sqP = new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;
                rowP.remove(board[i][j]);
                colP.remove(board[j][i]);
                int kj = j / 3;
                int lj = j % 3;
                int ki = i / 3;
                int li = i % 3;
                sqP.remove(board[kj + 3 * ki][lj + 3 * li]);
            }
            rowPossibilities.put(i, rowP);
            columnPossibilities.put(i, colP);
            squarePossibilities.put(i, sqP);
        }
        solve(board, rowPossibilities, columnPossibilities, squarePossibilities, 0, board.length-1);
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }

    private boolean solve(char[][] board, Map<Integer, Set<Character>> rowP, Map<Integer, Set<Character>> colP, Map<Integer, Set<Character>> sqP, int startI, int startJ) {
        for (int i=0;i<board.length;i++) {
            for (int j=0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    Set<Character> intersect = Sets.intersection(sqP.get(i), Sets.intersection(rowP.get(i), colP.get(j)));
                    if (intersect.isEmpty()) {
                        return false;
                    }
                    Set<Character> intersection = new HashSet<>(intersect);
                    for (char ch : intersection) {
                        board[i][j] = ch;
                        rowP.get(i).remove(ch);
                        colP.get(j).remove(ch);
                        sqP.get(i).remove(ch);
                        if (solve(board, rowP, colP, sqP, startI, startJ)) {
                            break;
                        }
                        rowP.get(i).add(ch);
                        colP.get(j).add(ch);
                        sqP.get(i).add(ch);
                        board[i][j] = '.';
                    }
                }
            }
        }
        return true;
    }
}
