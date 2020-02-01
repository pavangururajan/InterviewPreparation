package com.test.facebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class SerializeDeserializeBinaryTreeTest {

    @Test
    public void serialize() {
    }

    @Test
    public void deserialize() {
        String s = "1$2$17$$$$3$4$$$5$$6";
        SerializeDeserializeBinaryTree serializeDeserializeBinaryTree = new SerializeDeserializeBinaryTree();
        SerializeDeserializeBinaryTree.TreeNode root = serializeDeserializeBinaryTree.deserialize(s);
    }
}