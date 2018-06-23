package com.test.google.design;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: pavan.g
 * created: 31/05/18.
 */
public class TicTacToe {
    Map<Integer, BitSet> players;
    List<BitSet> conditions;
    int n;

    public TicTacToe(int n) {
        this.n = n;
        //horizontal
        conditions = new ArrayList<>();
        players = new HashMap<>();
        for (int i = 0; i < n; i++) {
            BitSet condition = new BitSet(n * n);
            condition.set(i * n, (i + 1) * n);
            conditions.add(condition);
        }
        //vertical
        for (int i = 0; i < n; i++) {
            BitSet condition = new BitSet(n * n);
            for (int j = i; j < n * n; j += n) {
                condition.set(j);
            }
            conditions.add(condition);
        }
        //diagonal
        BitSet left = new BitSet(n * n);
        for (int i = 0; i < n * n; i += (n + 1)) {
            left.set(i);
        }
        conditions.add(left);
        BitSet right = new BitSet(n * n);
        for (int i = n - 1; i < n * n - 1; i += (n - 1)) {
            right.set(i);
        }
        conditions.add(right);
    }

    /**
     * Player {player} makes a move at ({row}, {col}).
     *
     * @param row    The row of the board.
     * @param col    The column of the board.
     * @param player The player, can be either 1 or 2.
     * @return The current winning condition, can be either:
     * 0: No one wins.
     * 1: Player 1 wins.
     * 2: Player 2 wins.
     */
    public int move(int row, int col, int player) {
        BitSet p = players.getOrDefault(player, new BitSet(n * n));
        int index = row * n + col;
        p.set(index);
        players.put(player, p);
        boolean success = false;
        for (BitSet c : conditions) {
            BitSet check = (BitSet) p.clone();
            check.and(c);
            if (check.cardinality() == n) {
                System.out.println(check.toString());
                return player;
            }
        }
        System.out.println(0);
        return 0;
    }
}
