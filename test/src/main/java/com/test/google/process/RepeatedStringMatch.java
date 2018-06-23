package com.test.google.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: pavan.g
 * created: 14/05/18.
 */
public class RepeatedStringMatch {
    public int repeatedArrayStringMatch(String A, String B) {
        if (A == null || B == null) {
            return -1;
        }
        if (A.length() == 0 || B.length() == 0) {
            return -1;
        }
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();
        int pointerA = 0;
        int pointerB = 0;
        int repeat = 1;
        boolean match = false;
        do {
            if (aArray[pointerA] == bArray[pointerB]) {
                pointerB = (pointerB + 1) % bArray.length;
                match = true;
                if (pointerB == 0) {
                    return repeat;
                }
            } else {
                pointerB = 0;
                match = false;
            }
            pointerA = (pointerA + 1) % aArray.length;
            if (pointerA == 0) {
                repeat++;
            }
        } while (repeat == 1 || match);
        return -1;
    }

    public int repeatedStringMatch(String A, String B) {
        Map<Character, List<Node>> nodeMap = new HashMap<Character, List<Node>>();
        Node previous = null;
        Node current = null;
        Node head = null;
        for (char ch : A.toCharArray()) {
            List<Node> nodeList = nodeMap.get(ch);
            if (nodeList == null) {
                nodeList = new ArrayList<Node>();
            }
            current = new Node(ch);
            nodeList.add(current);
            nodeMap.put(ch, nodeList);
            if (previous != null) {
                previous.setNext(current);
            } else {
                head = current;
                head.setHead(true);
            }
            previous = current;
        }
        previous.setNext(head);
        char[] bArray = B.toCharArray();
        List<Node> nodes = nodeMap.get(bArray[0]);
        if (nodes == null) {
            return -1;
        }
        for (Node n : nodes) {
            int success = march(n, bArray);
            if (success != -1) {
                return success;
            }
        }
        return -1;
    }

    private int march(Node n, char[] B) {
        Node current = n;
        int repeat = 1;
        for (int i = 0; i < B.length ; i++) {
            char ch = B[i];
            if (current.getCh() != ch) {
                return -1;
            }
            if (current.isHead() && i > 0) {
                repeat++;
            }
            current = current.getNext();
        }
        return repeat;
    }

    public static class Node {
        char ch;
        Node next;
        boolean head;

        public boolean isHead() {
            return head;
        }

        public void setHead(boolean head) {
            this.head = head;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public char getCh() {
            return ch;
        }

        public Node getNext() {
            return next;
        }

        public Node(char ch) {
            this.ch = ch;
            this.head = false;
        }

        public String toString() {
            return String.valueOf(ch);
        }
    }
}
