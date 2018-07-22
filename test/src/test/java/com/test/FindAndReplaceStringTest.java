package com.test;

import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: pavan.g
 * created: 13/05/18.
 */
public class FindAndReplaceStringTest {


    @Test
    public void findReplaceString() {
        String S = "abcd";
        int[] indexes = {0,2};
        String[] sources = {"ab", "ec"};
        String[] targets = {"eee", "ffff"};
        FindAndReplaceString findAndReplaceString = new FindAndReplaceString();
        System.out.println(findAndReplaceString.findReplaceString(S, indexes, sources, targets));
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
    }
}