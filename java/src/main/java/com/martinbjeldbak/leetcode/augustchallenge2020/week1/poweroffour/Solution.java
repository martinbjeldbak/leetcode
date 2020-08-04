package com.martinbjeldbak.leetcode.augustchallenge2020.week1.poweroffour;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3412/
class Solution {
    public boolean isPowerOfFour(int num) {
        double logBase4 = log4(num);

        return (int)logBase4 == logBase4;
    }


    private static double log4(int x) {
        return log(x, 4);
    }

    private static double log(int x, int base) {
        return (Math.log(x) / Math.log(base));
    }
}
