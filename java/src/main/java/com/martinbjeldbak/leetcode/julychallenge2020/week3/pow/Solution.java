package com.martinbjeldbak.leetcode.julychallenge2020.week3.pow;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3392/
public class Solution {
    public double myPow(double x, int n) {
        double val = Math.pow(x, n);
        BigDecimal t = new BigDecimal(val);

        return t.setScale(4, RoundingMode.HALF_EVEN).doubleValue();
    }
}