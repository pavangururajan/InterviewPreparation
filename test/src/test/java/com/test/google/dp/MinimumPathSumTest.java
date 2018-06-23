package com.test.google.dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: pavan.g
 * created: 30/05/18.
 */
public class MinimumPathSumTest {

    @Test
    public void minPathSum() {
        int[][] input = {
         {9, 1, 4, 8}
//  {1,5,1},
//  {4,2,1}
        };
        Stack<String> stack = new Stack<>();
        stack.toArray();
        List<Integer> l = new ArrayList<>();
        l.listIterator();
        MinimumPathSum solution = new MinimumPathSum();
        System.out.println(solution.minPathSum(input));
    }
}