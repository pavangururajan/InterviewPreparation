package com.test.grabprep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> hashes = new HashSet<>();
        Set<String> result = new HashSet<>();
        if (s.length() > 10) {
            for (int i = 0; i <= s.length()-10; i++) {

            }
        }
        return new ArrayList<>(result);
    }
}
