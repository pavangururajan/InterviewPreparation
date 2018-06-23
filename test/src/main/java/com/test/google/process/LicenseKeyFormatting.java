package com.test.google.process;

/**
 * @author: pavan.g
 * created: 17/05/18.
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        char[] justString = S.replace("-", "").toCharArray();
        StringBuilder result = new StringBuilder();
        int i = justString.length - 1;
        int j = 0;
        while (i >= 0) {
            result.append(justString[i]);
            j++;
            i--;
            if (j % K == 0 && i >= 0) {
                result.append("-");
            }
        }
        return result.reverse().toString().toUpperCase();
    }
}
