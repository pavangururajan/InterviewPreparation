package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: pavan.g
 * created: 09/05/18.
 */
public class MaskEmailPhone {

    private static final Set<Character> extraPhoneChars = new HashSet<Character>(Arrays.asList(new Character[] {'+', '-', ' ', '(', ')'}));
    private static final Set<Character> extraEmailChars = new HashSet<Character>(Arrays.asList(new Character[] {'.', '@'}));

    public String maskPII(String S) {
        if (S == null || S.equals("")) {
            return S;
        }
        char[] input = S.trim().toCharArray();
        if (extraPhoneChars.contains(input[0]) || (input[0] >= '0' && input[0] <= '9')) {
            return maskPhone(input);
        } else {
            return maskEmail(S.trim());
        }
    }

    private String maskPhone(char[] S) {
        String result = null;
        List<Character> resultArray = new ArrayList<Character>();
        Set<Integer> dashIndices = new HashSet<Integer>(Arrays.asList(new Integer[] {4, 8, 12}));
        for (int i = S.length-1; i >= 0; i--) {
            if (extraPhoneChars.contains(S[i])) {
                continue;
            }
            char ch = '*';
            if (dashIndices.contains(resultArray.size())) {
                resultArray.add(0, '-');
            }
            if (resultArray.size() <= 4) {
                ch = S[i];
            }
            resultArray.add(0, ch);
        }
        if (S.length > 10) {
            resultArray.add(0, '+');
        }
        return getStringRepresentation(resultArray);
    }

    private String maskEmail(String input) {
        String loweredInput = input.toLowerCase();
        char[] inputArray = loweredInput.toCharArray();
        List<Character> resultArray = new ArrayList<Character>(Arrays.asList(new Character[] {inputArray[0], '*', '*', '*', '*', '*', inputArray[loweredInput.indexOf('@')-1]}));
        for (int i = loweredInput.indexOf('@'); i < inputArray.length; i++) {
            resultArray.add(inputArray[i]);
        }
        return getStringRepresentation(resultArray);
    }

    private String getStringRepresentation(List<Character> list)
    {
        StringBuilder builder = new StringBuilder(list.size());
        for(Character ch: list)
        {
            builder.append(ch);
        }
        return builder.toString();
    }
}
