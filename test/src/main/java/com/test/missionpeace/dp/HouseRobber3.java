package com.test.missionpeace.dp;

import javafx.util.Pair;

/**
 * https://leetcode.com/problems/house-robber-iii/description/
 *
 * @author: pavan.g
 * created: 24/07/18.
 */
public class HouseRobber3 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int rob(TreeNode root) {
        Pair<Integer, Integer> result = helper(root);
        return result.getKey();
    }

    private Pair<Integer, Integer> helper(TreeNode node) {
        if (node == null) {
            return new Pair<>(0,0);
        }
        Pair<Integer, Integer> left = new Pair<>(0,0);
        Pair<Integer, Integer> right = new Pair<>(0,0);
        if (node.left != null) {
            left = helper(node.left);
        }
        if (node.right != null) {
            right = helper(node.right);
        }
        int temp = left.getValue() + right.getValue();
        int prevSum = left.getKey() + right.getKey();
        int maxSum = Math.max(prevSum, temp + node.val);
        return new Pair<>(maxSum, prevSum);
    }
}
