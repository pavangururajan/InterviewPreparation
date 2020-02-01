package com.test.facebook;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Permutations2Test {

    @Test
    public void permuteUnique() {
        Permutations2 obj = new Permutations2();
        List<List<Integer>> result = obj.permuteUnique(new int[]{1,1,2});
        for (List<Integer> l : result) {
            System.out.println(Arrays.toString(l.toArray()));
        }
    }
}