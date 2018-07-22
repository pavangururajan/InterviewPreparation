package com.test.careem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 14/07/18.
 */
public class CutSticksTest {

    @Test
    public void cutSticks() {
        CutSticks cutSticks = new CutSticks();
        System.out.println(Arrays.toString(cutSticks.cutSticks(new int[] {})));
    }
}