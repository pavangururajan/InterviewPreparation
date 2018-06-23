package com.test.google.array;

import java.util.TreeSet;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class AddBoldTagInString {
    public String addBoldTag(String s, String[] dict) {
        if (s == null) {
            return null;
        }
        if (s.length() == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        TreeSet<IndexPair> indexPairs = new TreeSet<IndexPair>();
        for (String pattern : dict) {
            int startIndex = s.indexOf(pattern);
            if (startIndex == -1) {
                continue;
            } else {
                startIndex = -1;
                do {
                    startIndex = s.indexOf(pattern, startIndex+1);
                    indexPairs.add(new IndexPair(startIndex, startIndex + pattern.length() - 1));
                } while (s.indexOf(pattern, startIndex+1) != -1);
            }
        }
        TreeSet<IndexPair> newIndexPairs = shorten(indexPairs);
        int current = 0;
        for (IndexPair each : newIndexPairs) {
            result.append(s.substring(current, each.start));
            result.append("<b>");
            result.append(s.substring(each.start, each.end + 1));
            result.append("</b>");
            current = each.end + 1;
        }
        result.append(s.substring(current, s.length()));
        return result.toString();
    }

    private TreeSet<IndexPair> shorten(TreeSet<IndexPair> indexPairs) {
        TreeSet<IndexPair> result = new TreeSet<IndexPair>();
        if (indexPairs.isEmpty()) {
            return result;
        }
        IndexPair current = indexPairs.first();
        for (IndexPair each : indexPairs) {
            if (current.end >= each.start - 1) {
                if (result.contains(current)) {
                    result.remove(current);
                }
                current = new IndexPair(current.start, Math.max(current.end, each.end));
            } else {
                current = new IndexPair(each.start, each.end);
            }
            result.add(current);
        }
        return result;
    }

    class IndexPair implements Comparable<IndexPair> {
        int start;
        int end;

        public IndexPair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(IndexPair o) {
            if (this.start == o.start) {
                return this.end - o.end;
            }
            return this.start - o.start;
        }
    }
}
