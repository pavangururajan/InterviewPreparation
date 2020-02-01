package com.test.facebook;

public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        if (trust == null || N == 0) {
            return -1;
        }

        boolean[] truster = new boolean[N+1];
        for (int i = 0; i < trust.length; i++) {
            truster[trust[i][0]] = true;
        }

        int judgeCandidate = -1;
        for (int i = 1; i <= N; i++) {
            if (!truster[i]) {
                if (judgeCandidate != -1) return -1;
                judgeCandidate = i;
            }
        }

        truster = new boolean[N+1];
        for (int i = 0; i < trust.length; i++) {
            if (trust[i][1] == judgeCandidate)
                truster[trust[i][0]] = true;
        }

        for (int i = 1; i <= N; i++) {
            if (!truster[i] && i != judgeCandidate) {
                return -1;
            }
        }

        return judgeCandidate;

    }
}
