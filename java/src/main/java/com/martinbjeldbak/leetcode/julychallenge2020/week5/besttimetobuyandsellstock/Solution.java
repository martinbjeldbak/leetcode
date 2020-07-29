package com.martinbjeldbak.leetcode.julychallenge2020.week5.besttimetobuyandsellstock;

import java.util.Arrays;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/548/week-5-july-29th-july-31st/3405/
class Solution {
    public int maxProfit(int[] prices) {
        return profitAt(0, prices);
    }

    private static int profitAt(int quantity, int[] prices) {

        if(prices.length == 0)
            return 0;
        // buy
        int buyProfit = -prices[0] + profitAt(quantity + 1, Arrays.copyOfRange(prices, 1, prices.length));
        // sell
        int sellProfit;
        if(quantity > 0) {
             sellProfit = quantity * prices[0] + profitAt(0, Arrays.copyOfRange(prices, 2 > prices.length ? 1 : 2, prices.length));
        } else {
            sellProfit = 0;
        }

        return Math.max(buyProfit, sellProfit);
    }
}