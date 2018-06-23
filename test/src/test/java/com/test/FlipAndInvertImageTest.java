package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 13/05/18.
 */
public class FlipAndInvertImageTest {

    @Test
    public void flipAndInvertImage() {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        FlipAndInvertImage flipAndInvertImage = new FlipAndInvertImage();
        int[][] result = flipAndInvertImage.flipAndInvertImage(A);
        System.out.println(result);
    }
}