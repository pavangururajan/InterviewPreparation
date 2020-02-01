package com.test.facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddBoldTag {
    public String addBoldTag(String s, String[] dict) {
        if (s == null || dict == null || dict.length == 0) {
            return s;
        }
        List<Index> indexList = new ArrayList<>();
        for (String substr : dict) {
            int start = s.indexOf(substr);
            while (start != -1) {
                indexList.add(new Index(start, start + substr.length()));
                start = s.substring(start + substr.length(), s.length()).indexOf(substr);
                start = start == -1 ? -1 : start + substr.length();
            }
        }
        Collections.sort(indexList);
        List<Index> collapsedIndexList = new ArrayList<>();
        int lastMax = -1;
        int lastStart = -1;
        StringBuilder resultBuilder = new StringBuilder();
        for (Index e : indexList) {
            if (lastMax == -1 && lastStart == -1) {
                lastStart = e.start;
                lastMax = e.end;
                resultBuilder.append(s.substring(0, lastStart));
                resultBuilder.append("<b>");
                continue;
            }
            if (e.start <= lastMax) {
                lastMax = Math.max(lastMax, e.end);
                collapsedIndexList.add(new Index(lastStart, lastMax));
            } else {
                resultBuilder.append(s.substring(lastStart, lastMax));
                resultBuilder.append("<\\b>");
                collapsedIndexList.add(e);
                lastStart = e.start;
                resultBuilder.append(s.substring(lastMax, lastStart));
                resultBuilder.append("<b>");
                lastMax = e.end;
            }
        }
        resultBuilder.append(s.substring(lastStart, lastMax));
        resultBuilder.append("<\\b>");
        resultBuilder.append(s.substring(lastMax+1, s.length()));
        return resultBuilder.toString();
    }

    public static class Index implements Comparable<Index> {
        private int start;
        private int end;

        public Index(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        @Override
        public int compareTo(Index o) {
            if (this.getStart() < o.getStart()) {
                return -1;
            } else if (this.getStart() > o.getStart()) {
                return 1;
            }
            return 0;
        }
    }
}
