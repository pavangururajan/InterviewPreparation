package com.test.facebook;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MoveZerosTest {

    @Test
    public void moveZeroes() {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = new int[]{0,1};
        System.out.println(Arrays.toString(nums));
        moveZeros.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}