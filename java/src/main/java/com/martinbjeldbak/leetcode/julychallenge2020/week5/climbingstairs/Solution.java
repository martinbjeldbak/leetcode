package com.martinbjeldbak.leetcode.julychallenge2020.week5.climbingstairs;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/548/week-5-july-29th-july-31st/3407/
class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}