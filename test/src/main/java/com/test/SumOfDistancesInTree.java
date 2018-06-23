package com.test;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author: pavan.g
 * created: 13/05/18.
 */
public class SumOfDistancesInTree {
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        return edges[0];
    }

    private static class TreeNode {
        long id;
        private Collection<TreeNode> children;
        private TreeNode parent;

        public TreeNode(long id) {
            this.id = id;
            children = new HashSet<TreeNode>();
        }

        public void setParent(TreeNode parent) {
            this.parent = parent;
        }

        public void addChild(TreeNode child) {
            children.add(child);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TreeNode)) return false;
            TreeNode treeNode = (TreeNode) o;
            return id == treeNode.id;
        }
    }
}
