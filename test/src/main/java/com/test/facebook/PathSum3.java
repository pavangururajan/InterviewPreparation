package com.test.facebook;

import javafx.util.Pair;

import java.util.*;

public class PathSum3 {
    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer, Integer> preSum = new HashMap();
        preSum.put(0,1);
        return helper(root, 0, sum, preSum);
    }

    public int helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> preSum) {
        if (root == null) {
            return 0;
        }

        currSum += root.val;
        int res = preSum.getOrDefault(currSum - target, 0);
        preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);

        res += helper(root.left, currSum, target, preSum) + helper(root.right, currSum, target, preSum);
        preSum.put(currSum, preSum.get(currSum) - 1);
        return res;
    }

    public static class TreeNode {
        public TreeNode(int value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int val;
        public TreeNode left;
        public TreeNode right;
    }

    public class PairComparator implements  Comparator<List<Integer>> {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            return Integer.compare(o1.get(0), o2.get(0));
        }
    }

    private static class DominoPair {
        public int i;
        public int j;

        public DominoPair(int x, int y) {
            this.i = Math.min(x,y);
            this.j = Math.max(x,y);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof DominoPair)) return false;
            DominoPair that = (DominoPair) o;
            return i == that.i &&
                    j == that.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}
