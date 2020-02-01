package com.test.contest;

public class DeleteNodeTreeCumulative {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        boolean rootRemove = removeNode(root, target);
        if (rootRemove) root = null;
        return root;
    }

    private boolean removeNode(TreeNode root, int target) {
        if (root == null) return true;

        boolean left = removeNode(root.left, target);
        boolean right = removeNode(root.right, target);
        if (left) root.left = null;
        if (right) root.right = null;
        return left && right && root.val == target;
    }
}
