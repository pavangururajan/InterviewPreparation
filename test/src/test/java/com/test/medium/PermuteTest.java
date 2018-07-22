package com.test.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 10/07/18.
 */
public class PermuteTest {

    @Test
    public void permute() {
        Permute permute = new Permute();
        System.out.println(permute.permute(new int[]{1,2,3}));
    }
}