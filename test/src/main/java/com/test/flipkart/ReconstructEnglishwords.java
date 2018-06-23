package com.test.flipkart;

import java.util.Set;

/**
 * @author: pavan.g
 * created: 09/06/18.
 */
public class ReconstructEnglishwords {
    public String reconstruct(String input, Set<String> words) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            s = new StringBuilder();
            if (words.contains(input.substring(0, i+1))) {
                int start = i+1;
                for (int j = start+1; j < input.length(); j++) {
                    if (words.contains(input.substring(start, j))) {
                        start = j;
                    }
                }
                if (start == input.length()) {

                }
            }
        }
        return s.toString();
    }
}
