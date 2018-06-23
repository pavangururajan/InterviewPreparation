package com.test.google.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: pavan.g
 * created: 23/05/18.
 */
public class MergeKSortedListsTest {

    @Test
    public void mergeKLists() {
        int[][] input = {};
        MergeKSortedLists.ListNode[] listNodes = new MergeKSortedLists.ListNode[input.length];
        for (int i = 0; i < input.length; i++) {
            MergeKSortedLists.ListNode current = null;
            for (int j = 0; j < input[i].length; j++) {
                MergeKSortedLists.ListNode listNode = new MergeKSortedLists.ListNode(input[i][j]);
                listNode.next = null;
                if (current != null) {
                    current.next = listNode;
                } else {
                    listNodes[i] = listNode;
                }
                current = listNode;
            }
        }
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        MergeKSortedLists.ListNode result = mergeKSortedLists.mergeKLists(listNodes);
        print(result);
    }

    private void print(MergeKSortedLists.ListNode node) {
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        System.out.println(list);
    }
}