package com.martinbjeldbak.leetcode.julychallenge2020.week3.pow;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3392/
public class Solution {
    public double myPow(double x, int n) {
        double pow;

        if(n == 0)
            return 1;

        if(n < 0) {
            x = 1 / x;
            n = -n;
        }

        pow = x;

        while(n > 1) {
            pow *= x;
            n--;
        }

        // Do this conversion for 4 decimal digit truncation
        return (long)(pow * 100000) / 100000.0;
    }
}