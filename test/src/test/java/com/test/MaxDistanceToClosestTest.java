package com.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 11/06/18.
 */
public class MaxDistanceToClosestTest {

    @Test
    public void maxDistToClosest() {
        MaxDistanceToClosest m = new MaxDistanceToClosest();
        int[] input = {0,0,0,0,1,0,0,0,0,0};
        System.out.println(m.maxDistToClosest(input));
    }

    @Test
    public void testStream() {
        int[][] input  ={{1,0},{2,1},{3,1},{3,7},{4,3},{5,3},{6,3}};
        TreeSet<Integer> t = new TreeSet<>();
        System.out.println((int)(-1/2));
    }

}