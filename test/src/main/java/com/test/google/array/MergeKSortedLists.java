package com.test.google.array;

import java.util.Objects;

/**
 * @author: pavan.g
 * created: 23/05/18.
 */
public class MergeKSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ListNode)) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val &&
                    Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {

            return Objects.hash(val, next);
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode resultHead = null;
        ListNode current = resultHead;
        boolean done = false;
        while (true) {
            int minIndex = 0;
            int minValue = Integer.MAX_VALUE;
            done = true;
            for (int k = 0; k < lists.length; k++) {
                if (lists[k] != null && lists[k].val <= minValue) {
                    minValue = lists[k].val;
                    minIndex = k;
                } else if (lists[k] == null) {
                    done = done && true;
                    continue;
                }
                done = done && false;
            }
            if (done) {
                break;
            }
            lists[minIndex] = lists[minIndex].next;
            ListNode node = new ListNode(minValue);
            if (resultHead == null) {
                resultHead = node;
                current = node;
            } else {
                current.next = node;
                current = node;
            }
        }
        return resultHead;
    }
}
