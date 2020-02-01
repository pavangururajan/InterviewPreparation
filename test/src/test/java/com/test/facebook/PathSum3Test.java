package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class PathSum3Test {

    @Test
    public void pathSum() {
        PathSum3 obj = new PathSum3();
        PathSum3.TreeNode l3 = new PathSum3.TreeNode(3);
        PathSum3.TreeNode m2 = new PathSum3.TreeNode(-2);
        PathSum3.TreeNode one = new PathSum3.TreeNode(1);
        PathSum3.TreeNode eleven = new PathSum3.TreeNode(11);
        PathSum3.TreeNode m3 = new PathSum3.TreeNode(-3, null, eleven);
        PathSum3.TreeNode three = new PathSum3.TreeNode(3, l3, m2);
        PathSum3.TreeNode two = new PathSum3.TreeNode(2, null, one);
        PathSum3.TreeNode five = new PathSum3.TreeNode(5, three, two);
        PathSum3.TreeNode root = new PathSum3.TreeNode(10, five, m3);

        System.out.println(obj.pathSum(root, 8));
    }
}