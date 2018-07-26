package com.test.missionpeace.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 24/07/18.
 */
public class MatrixChainMultiplicationTest {

    @Test
    public void minCost() {
        MatrixChainMultiplication matrixChainMultiplication = new MatrixChainMultiplication();
        System.out.println(matrixChainMultiplication.minCost(new int[]{40, 20, 30,10,30}));
    }
}