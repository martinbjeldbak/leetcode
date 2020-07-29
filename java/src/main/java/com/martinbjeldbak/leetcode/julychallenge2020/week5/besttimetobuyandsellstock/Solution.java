package com.martinbjeldbak.leetcode.julychallenge2020.week5.besttimetobuyandsellstock;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/548/week-5-july-29th-july-31st/3405/
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;

        int[] s0 = new int[prices.length];
        int[] s1 = new int[prices.length];
        int[] s2 = new int[prices.length];

        s0[0] = 0; // if we rest
        s1[0] = -prices[0]; // if we buy
        s2[0] = Integer.MIN_VALUE; // cool state after selling

        for(int i = 1; i < prices.length; i++) {
            s0[i] = Math.max(s0[i - 1], s2[i - 1]);
            s1[i] = Math.max(s0[i - 1] - prices[i], s1[i - 1]);
            s2[i] = s1[i - 1] + prices[i];
        }

        return Math.max(s0[prices.length - 1], s2[prices.length - 1]);
    }
}