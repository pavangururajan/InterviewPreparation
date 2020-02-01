package com.test.facebook;

public class SerializeDeserializeBinaryTree {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(Integer.toString(root.val));
        builder.append('$');
        String left = serialize(root.left);
        builder.append(left);
        builder.append('$');
        String right = serialize(root.right);
        builder.append(right);
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Result result  = deserializeHelper(data, -1);
        return result.node;
    }

    private Result deserializeHelper(String data, int start) {
        if (start >= data.length()) return new Result(null, start);

        int findIndex = data.indexOf('$', start+1);
        findIndex = findIndex != -1 ? findIndex : data.length();
        String value = data.substring(start+1, findIndex);
        if (value.isEmpty()) return new Result(null, start);
        TreeNode node = new TreeNode(Integer.parseInt(value));
        Result leftResult = deserializeHelper(data, findIndex);
        node.left = leftResult.node;
        Result rightResult = deserializeHelper(data, leftResult.index);
        node.right = rightResult.node;
        return new Result(node, rightResult.index);
    }

    public static class Result {
        public TreeNode node;
        public int index;
        Result(TreeNode node, int i) {
            index = i;
            this.node = node;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

