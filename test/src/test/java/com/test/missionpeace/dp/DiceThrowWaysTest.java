package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 17/07/18.
 */
public class DiceThrowWaysTest {

    @Test
    public void diceThrowWays() {
        DiceThrowWays diceThrowWays = new DiceThrowWays();
        System.out.println(diceThrowWays.diceThrowWays(4, 2, 1));
    }
}