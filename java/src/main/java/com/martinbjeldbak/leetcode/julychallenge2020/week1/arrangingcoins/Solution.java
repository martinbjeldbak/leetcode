package com.martinbjeldbak.leetcode.julychallenge2020.week1.arrangingcoins;

// https://leetcode.com/explore/featured/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3377/
class Solution {
    public int arrangeCoins(int n) {
        int numFullStairCases = 0;
        int nextLevel;

        while(n > 0) {
            nextLevel = (numFullStairCases + 1);

            if(n - nextLevel >= 0) {
                n = n - nextLevel;
                numFullStairCases++;
            }
            else {
                break;
            }
        }

        return numFullStairCases;
    }
}
