package com.martinbjeldbak.leetcode.julychallenge2020.week3.pow;

import java.math.BigDecimal;
import java.math.RoundingMode;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3392/
public class Solution {
    BigDecimal pow;

    public double myPow(double x, int n) {
        if(n < 0)
            return myPow(1 / x, -n);
        if(n == 1)
            return x;

        pow = new BigDecimal(x * myPow(x, n - 1));

        return pow.setScale(4, RoundingMode.HALF_EVEN).doubleValue();
    }
}