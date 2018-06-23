package com.test.google.array;

import java.util.Arrays;

/**
 * @author: pavan.g
 * created: 19/05/18.
 */
public class StatefulReadNCharsGivenRead4 extends Reader4 {
    int currentPos = 0;
    char[] buffer = {0, 0, 0, 0};
    int existingLength = 0;

    public int read(char[] buf, int n) {
        int total = 0;

        if (currentPos % 4 != 0) {
            int buffered = Math.min(n, existingLength - (currentPos % 4));
            n -= buffered;
            System.arraycopy(buffer, currentPos % 4, buf, total, buffered);
            System.out.println("Buffer: " + Arrays.toString(buffer) + " CurrentPos: " + currentPos%4 + " Total: " + total + " Buffered: " + buffered);
            total += buffered;
        }

        int reads = (int) Math.ceil(n / 4);
        boolean eof = false;
        int bytesRead = 0;
        for (int i = 1; i <= reads; i++) {
            int length = read4(buffer);
            int startIndex = 0;
            System.arraycopy(buffer, startIndex, buf, total, length);
            total += length;
            bytesRead += length;
            System.out.println("Buffer: " + Arrays.toString(buffer) + " Total: " + total + " Length: " + length);
            if (length < 4) {
                eof = true;
                break;
            }
            existingLength = length;
        }
        if (!eof) {
            int remaining = n - bytesRead;
            if (remaining > 0) {
                int length = read4(buffer);
                if (length > 0) {
                    System.arraycopy(buffer, 0, buf, total, Math.min(length, remaining));
                    total += Math.min(length, remaining);
                    System.out.println("Buffer: " + Arrays.toString(buffer) + " Total: " + total + " Length: " + Math.min(length, remaining));
                    existingLength = length;
                }
            }
        }
        currentPos += total;
        return total;
    }
}
