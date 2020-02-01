package com.test.facebook;

public class CustomSortString {
    public String customSortString(String S, String T) {
        if (S == null || S.length() == 0 || T == null || T.length() == 0) return T;

        int[] precedence = new int[26];
        for (int i = 0; i < 26; i++) {
            precedence[i] = Integer.MAX_VALUE;
        }

        int count = 0;
        for (int i = S.length()-1; i >= 0; i--) {
            precedence[S.charAt(i) - 'a'] = count;
            count++;
        }

        return mergeSort(T, precedence, 0, T.length()-1);
    }

    private String mergeSort(String T, int[] precedence, int start, int end) {
        if (start >= end) {
            StringBuilder b = new StringBuilder();
            b.append(T.charAt(start));
            return b.toString();
        }

        int mid = (start + end)/2;
        String left = mergeSort(T, precedence, start, mid);
        String right = mergeSort(T, precedence, mid+1, end);

        StringBuilder builder = new StringBuilder();

        int leftptr = 0;
        int rightptr = 0;

        while (leftptr < left.length() || rightptr < right.length()) {
            char leftChar = 0;
            char rightChar = 0;
            if (leftptr < left.length())
                leftChar = left.charAt(leftptr);
            int leftp = leftptr < left.length() ? precedence[leftChar - 'a'] : -1;
            if (rightptr < right.length())
                rightChar = right.charAt(rightptr);
            int rightp = rightptr < right.length() ? precedence[rightChar - 'a'] : -1;

            if (leftp >= rightp) {
                builder.append(leftChar);
                leftptr++;
            } else {
                builder.append(rightChar);
                rightptr++;
            }
        }
        return builder.toString();
    }
}
