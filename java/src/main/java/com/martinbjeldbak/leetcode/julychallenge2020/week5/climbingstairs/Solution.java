package com.martinbjeldbak.leetcode.julychallenge2020.week5.climbingstairs;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/548/week-5-july-29th-july-31st/3407/
class Solution {
    Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        if(!memo.containsKey(n)) {
            memo.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        }

        return memo.get(n);
    }
}