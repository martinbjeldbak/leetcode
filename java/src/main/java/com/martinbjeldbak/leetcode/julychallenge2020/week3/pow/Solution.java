package com.martinbjeldbak.leetcode.julychallenge2020.week3.pow;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3392/
public class Solution {
    public double myPow(double x, int n) {
        long nLong = n;
        double pow;

        if(n == 0)
            return 1;
        if(x == 1) {
            return 1;
        }
        if(x == -1)
            return x * (n < 0 ? -1 : 1);

        if(n < 0) {
            x = 1 / x;
            nLong = -(long)n;
        }

        pow = x;

        while(nLong > 1) {
            pow *= x;

            // Terminate early if we are in small digits
            if(truncateDecimals(pow) == 0)
                return 0;

            nLong--;
        }

        // Do this conversion for 4 decimal digit truncation
        return truncateDecimals(pow);
    }

    private double truncateDecimals(double val) {
        return (long)(val * 100000) / 100000.0;
    }
}