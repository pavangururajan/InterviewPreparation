package com.test.google.array;

/**
 * @author: pavan.g
 * created: 23/05/18.
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] alphabetFrequency = new int[26];
        char[] sArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int index = sArray[i] - 'a';
            if (alphabetFrequency[index] == 0) {
                alphabetFrequency[index] = i+1;
            } else {
                alphabetFrequency[index] = -1;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int index = sArray[i] - 'a';
            if (alphabetFrequency[index] > 0) {
                return alphabetFrequency[index]-1;
            }
        }
        return -1;
    }
}
