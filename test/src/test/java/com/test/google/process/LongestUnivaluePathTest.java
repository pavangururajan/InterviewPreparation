package com.test.google.process;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 15/05/18.
 */
public class LongestUnivaluePathTest {

    @Test
    public void longestUnivaluePath() {
//        LongestUnivaluePath.TreeNode a = new LongestUnivaluePath.TreeNode(5);
//        LongestUnivaluePath.TreeNode b = new LongestUnivaluePath.TreeNode(4);
//        LongestUnivaluePath.TreeNode c = new LongestUnivaluePath.TreeNode(1);
//        LongestUnivaluePath.TreeNode d = new LongestUnivaluePath.TreeNode(1);
//        LongestUnivaluePath.TreeNode e = new LongestUnivaluePath.TreeNode(5);
//        LongestUnivaluePath.TreeNode f = new LongestUnivaluePath.TreeNode(5);
//        LongestUnivaluePath.TreeNode g = new LongestUnivaluePath.TreeNode(3);

        LongestUnivaluePath.TreeNode a = new LongestUnivaluePath.TreeNode(1);
        LongestUnivaluePath.TreeNode b = new LongestUnivaluePath.TreeNode(2);
        a.left = b;
//        a.right = e;
//        b.left = c;
//        b.right = d;
//        e.left = f;
        LongestUnivaluePath longestUnivaluePath = new LongestUnivaluePath();
        System.out.println(longestUnivaluePath.longestUnivaluePath(a));
    }
}