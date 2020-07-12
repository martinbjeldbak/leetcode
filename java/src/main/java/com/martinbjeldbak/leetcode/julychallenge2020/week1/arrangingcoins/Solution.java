package com.martinbjeldbak.leetcode.julychallenge2020.week1.arrangingcoins;

// https://leetcode.com/explore/featured/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3377/
class Solution {
    public int arrangeCoins(int n) {
        int numFullStairCases = 0;

        while(n > 0) {
            for(int i = 0; i < numFullStairCases + 1; i++) {
                n--;
            }
            numFullStairCases++;
        }

        return numFullStairCases - 1;
    }
}
