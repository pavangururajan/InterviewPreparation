package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 01/06/18.
 */
public class NumIslandsTest {

    @Test
    public void numIslands() {
        char[][] input = {{'1','0','1','1','1'},{'1','0','1','0','1'},{'1','1','1','0','1'}};
        NumIslands s = new NumIslands();
        System.out.println(s.numIslands(input));
    }
}