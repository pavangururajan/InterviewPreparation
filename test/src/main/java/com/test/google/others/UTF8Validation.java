package com.test.google.others;

/**
 * @author: pavan.g
 * created: 31/05/18.
 */
public class UTF8Validation {
    public boolean validUtf8(int[] data) {
        return validUtf8Helper(data, 0);
    }
    private boolean validUtf8Helper(int[] data, int start) {
        if (start >= data.length) {
            return true;
        }
        if (data == null || (start - data.length) == 0) {
            return true;
        }
        System.out.println(data[start] + " " + Integer.toBinaryString(data[start]));
        int count = 0;
        while ((data[start] & 0x80) == 0x80) {
            count++;
            data[start] = data[start] << 1;
        }
        System.out.println("Count: " + count);
        if (count == 1) {
            return false;
        }
        if (count == 0) {
            count = 1;
        }
        if (count > (data.length - start) || count > 4) {
            return false;
        }
        for (int i = start+1; i < start+count; i++) {
            if (data[i] >= 0xc0 || data[i] < 0x80) {
                return false;
            }
        }
        System.out.println("Count: " + (start+count) + " True");
        boolean success = validUtf8Helper(data, start+count);
        return true && success;
    }
}
