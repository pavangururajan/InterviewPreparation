package com.test.google.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: pavan.g
 * created: 23/05/18.
 */
public class CyclicSortedList {
    static class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val,Node _next) {
            val = _val;
            next = _next;
        }
    }

    public Node insert(Node head, int insertVal) {
        Node newNode = new Node(insertVal, null);
        newNode.next = newNode;
        if (head == null) {
            return newNode;
        }

        newNode.next = null;
        Node current = head;
        Node max = null;
        Node min = null;
        do {
            System.out.println("Current: " + current.val + " next: " + current.next.val);
            if (max == null || max.val < current.val) {
                max = current;
            }
            if (min == null || min.val > current.val) {
                min = current;
            }
            if (current.val < insertVal && current.next.val > insertVal) {
                newNode = new Node(insertVal, current.next);
                current.next = newNode;
                // current = newNode.next;
            } //else {
            current = current.next;
            //}
        } while (current.val != head.val);


        if (newNode.next == null) {
            Node previous = min.val > newNode.val ? min : max;
            newNode.next = previous.next;
            previous.next = newNode;
        }
        return head;
    }

    public static void printList(Node n) {
        Node current = n;
        List<Integer> intList = new ArrayList<>();
        do {
            intList.add(current.val);
            current = current.next;
        } while (current != n);
        System.out.println(intList);
    }

    public static Node create(int[] intList) {
        Node head = null;
        Node current = null;
        for (int i : intList) {
            Node newNode = new Node(i, null);
            if (current != null) {
                current.next = newNode;
            } else {
                head = newNode;
            }
            current = newNode;
        }
        if (current != null)
            current.next = head;
        return head;
    }
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 1};
        Node n = create(input);
        printList(n);
        CyclicSortedList solution = new CyclicSortedList();
        solution.insert(n, 7);
        printList(n);
    }
}
