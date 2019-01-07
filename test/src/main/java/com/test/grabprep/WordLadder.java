package com.test.grabprep;


import javafx.util.Pair;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, List<String>> graph = new HashMap<>();
        wordList.add(beginWord);
        for (int i = 0; i < wordList.size()-1; i++) {
            String a = wordList.get(i);
            List<String> aList = graph.getOrDefault(a, new ArrayList<>());
            graph.put(a, aList);
            for (int j = i+1; j < wordList.size(); j++) {
                String b = wordList.get(j);
                if (oneEdits(a, b)) {
                    graph.get(a).add(b);
                    List<String> bList = graph.getOrDefault(b, new ArrayList<>());
                    bList.add(a);
                    graph.put(b, bList);
                }
            }
        }
        System.out.println(graph);
        Queue<Pair<String, Integer>> queue = new ArrayDeque<>();
        queue.offer(new Pair<String, Integer>(beginWord, 1));
        while (!queue.isEmpty()) {
            Pair<String, Integer> pair = queue.poll();
            String word = pair.getKey();
            Integer level = pair.getValue();
            System.out.println("Got: " + word);
            if (word.equals(endWord)) return level;
            for (String child : graph.getOrDefault(word, new ArrayList<>())) {
                System.out.println("Adding: " + child);
                queue.offer(new Pair<String, Integer>(child, level+1));
            }
            graph.put(word, new ArrayList<>());
        }
        return 0;
    }

    private boolean oneEdits(String a, String b) {
        boolean edit = true;
        if (a.length() != b.length()) return false;
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) != b.charAt(i)) {
                if (edit) {
                    edit = false;
                } else {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}
