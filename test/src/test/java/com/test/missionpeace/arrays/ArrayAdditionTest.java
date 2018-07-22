package com.test.missionpeace.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 30/06/18.
 */
public class ArrayAdditionTest {

    @Test
    public void add() {
        ArrayAddition a = new ArrayAddition();
        System.out.println(Arrays.toString(a.add(new int[]{2, 3, 5, 9}, new int[]{2, 3, 5, 5, 2, 9, 3})));
    }
}