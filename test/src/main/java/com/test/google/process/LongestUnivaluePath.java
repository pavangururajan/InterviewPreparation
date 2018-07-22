package com.test.google.process;


/**
 * @author: pavan.g
 * created: 15/05/18.
 */
public class LongestUnivaluePath {
    public int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        traverse(root);
        return max;
    }
    public int traverse(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int ansLeft = traverse(node.left);
        int ansRight = traverse(node.right);
        int arrowLeft = 0;
        int arrowRight = 0;
        if (node.left != null && node.val == node.left.val) {
            arrowLeft += ansLeft + 1;
        }
        if (node.right != null && node.val == node.right.val) {
            arrowRight += ansRight + 1;
        }
        max = Math.max(max, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
