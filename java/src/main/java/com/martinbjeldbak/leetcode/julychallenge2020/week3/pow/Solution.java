package com.martinbjeldbak.leetcode.julychallenge2020.week3.pow;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3392/
public class Solution {
    public double myPow(double x, int n) {
        double pow = x;

        if(n < 0) {
            pow = 1 / x;
            x = 1 / x;
            n = -n;
        }

        while(n > 1) {
            pow *= x;
            n--;
        }

        return (long)(pow * 100000) / 100000.0;
    }
}