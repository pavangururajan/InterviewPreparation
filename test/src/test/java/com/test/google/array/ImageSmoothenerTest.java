package com.test.google.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: pavan.g
 * created: 22/05/18.
 */
public class ImageSmoothenerTest {

    @Test
    public void imageSmoother() {
        int[][] input = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        ImageSmoothener imageSmoothener = new ImageSmoothener();
        printArray(imageSmoothener.imageSmoother(input));
        input = new int[][] {{}, {}};
        printArray(imageSmoothener.imageSmoother(input));
    }

    private void printArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(Arrays.toString(input[i]));
        }
    }
}