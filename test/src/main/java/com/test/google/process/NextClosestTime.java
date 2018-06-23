package com.test.google.process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: pavan.g
 * created: 15/05/18.
 */
public class NextClosestTime {
    public String nextClosestTimeFail(String time) {
        char[] timeArray = time.replace(":", "").toCharArray();
        Set<Character> characters = new HashSet<Character>();
        for (char ch : timeArray) {
            characters.add(ch);
        }
        List<Character> allowed = new ArrayList<Character>(characters);
        Collections.sort(allowed);
        SpecialDigits specialDigits = new SpecialDigits(allowed);
        char[] nextTime = specialDigits.next(timeArray);
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < nextTime.length; i++) {
            result.append(nextTime[i]);
            if (i == 1) {
                result.append(":");
            }
        }
        return result.toString();
    }

    private static class SpecialDigits {
        private List<List<Character>> allowedList;
        private Character[] limits;

        public SpecialDigits(List<Character> allowed) {
            limits = new Character[]{'2', '9', '5', '9'};
            allowedList = new ArrayList<List<Character>>();
            Collections.sort(allowed);
            for (int i = 0; i < 4; i++) {
                List<Character> allowedChars = new ArrayList<Character>();
                for (char ch : allowed) {
                    if (ch < '0' || ch > limits[i]) {
                        continue;
                    }
                    allowedChars.add(ch);
                }
                allowedList.add(allowedChars);
            }
        }

        public char[] next(char[] number) {
            List<Character> result = new ArrayList<Character>();
            char[] resultArray = new char[number.length];
            int carryover = 1;
            for (int i = number.length - 1; i >= 0; i--) {
                List<Character> allowed = allowedList.get(i);
                int index = allowed.indexOf(number[i]);
                int quotient = (index + carryover) / allowed.size();
                int remainder = (index + carryover) % allowed.size();
                if (result.size() == 0) {
                    result.add(allowed.get(remainder));
                } else {
                    result.add(0, allowed.get(remainder));
                }
                if (quotient != 1) {
                    carryover = 0;
                }
            }
            for (int i = 0; i < result.size(); i++) {
                resultArray[i] = result.get(i);
            }
            return resultArray;
        }

        private boolean valid(List<Character> result) {
            if (result == null || result.size() != 4) {
                return false;
            }
            for (int i = 0; i < result.size(); i++) {
                Character ch = result.get(i);
                if (ch < '0' || ch > limits[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public String nextClosestTime(String time) {
        Set<Character> characters = new HashSet<Character>();
        for (char ch : time.toCharArray()) {
            characters.add(ch);
        }
        int hour = Integer.parseInt(time.split(":")[0]);
        int min = Integer.parseInt(time.split(":")[1]);
        int minhour = hour * 60 + min;
        while (true) {
            minhour = (minhour+1) % 1440;
            hour = minhour / 60;
            min = minhour % 60;
            String minHourString = String.format("%02d%02d", hour, min);
            if (contains(minHourString, characters)) {
                return String.format("%02d:%02d", hour, min);
            }
        }
    }

    private boolean contains(String str, Set<Character> characterSet) {
        for (char ch : str.toCharArray()) {
            if (!characterSet.contains(ch)) {
                return false;
            }
        }
        return true;
    }
}
