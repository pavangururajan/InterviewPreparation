package com.test.contest;

public class NineAndSix {
        public int maximum69Number (int num) {
                int place = 0;
                int maxPlace = 0;
                int dividend = num;
                do {
                        dividend = (int) (num/Math.pow(10, place));
                        if (dividend % 10 == 6)
                                maxPlace = place;
                        place++;
                } while (dividend > 0);
                return maxPlace != -1 ? (int) (num + 3*Math.pow(10, maxPlace)) : num;
        }
}
