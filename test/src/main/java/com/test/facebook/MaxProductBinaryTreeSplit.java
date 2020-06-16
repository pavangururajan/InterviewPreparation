package com.test.facebook;

import java.util.ArrayList;
import java.util.List;

public class MaxProductBinaryTreeSplit {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private static class TreeResult {
        public int sum;
        public int product;
    }

    public int maxProduct(TreeNode root) {
        List<Integer> sumList = new ArrayList<>();
        int total = constructSumTree(root, sumList);
        int divisor = 1000000007;
        long answer = 0;
        for (int s : sumList) {
            answer = Math.max(answer, (long)s * (total-s));
        }
        return (int) (answer % divisor);
    }

    private int constructSumTree(TreeNode node, List<Integer> sumList) {
        if (node == null) {
            return 0;
        }
        int sum = constructSumTree(node.left, sumList) + constructSumTree(node.right, sumList) + node.val;
        sumList.add(sum);
        return sum;
    }

    private long maxProductHelper(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        long product = sum * node.val;
        int leftVal = node.left == null ? 0 : node.left.val;
        int rightVal = node.right == null ? 0 : node.right.val;
        long leftProduct = maxProductHelper(node.left, sum + node.val - leftVal);
        long rightProduct = maxProductHelper(node.right, sum + node.val - rightVal);
        long maxProduct = Math.max(product, Math.max(leftProduct, rightProduct));
        return maxProduct;
    }
}
