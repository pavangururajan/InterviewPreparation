package com.test.google.array;

/**
 * @author: pavan.g
 * created: 18/05/18.
 */
public class ReaderNCharsGivenRead4 extends Reader4 {
    public int read(char[] buf, int n) {
        char[] buffer = new char[4];
        int reads = (int) Math.ceil(n / 4);
        int remainder = n % 4;
        int total = 0;
        boolean eof = false;
        for (int i = 1; i <= reads-1; i++) {
            int length = read4(buffer);
            System.arraycopy(buffer, 0, buf, total, length);
            total += length;
            if (length < 4) {
                eof = true;
                break;
            }
        }
        if (!eof) {
            int length = read4(buffer);
            if (length > 0) {
                System.arraycopy(buffer, 0, buf, total, Math.min(length, remainder));
                total += remainder;
            }
        }
        return total;
    }
}
