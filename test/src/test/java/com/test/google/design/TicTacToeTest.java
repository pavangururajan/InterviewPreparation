package com.test.google.design;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 31/05/18.
 */
public class TicTacToeTest {

    @Test
    public void move() {
        TicTacToe toe = new TicTacToe(2);
        toe.move(0, 1, 1);
        toe.move(1, 1, 2);
        toe.move(1, 0, 1);
    }

    @Test
    public void testBitString() {
        System.out.println(0xc0);
    }
}