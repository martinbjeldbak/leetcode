package com.martinbjeldbak.leetcode.julychallenge2020.week4.adddigits;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/547/week-4-july-22nd-july-28th/3402/

// This is the implementation of Digital Root https://en.wikipedia.org/wiki/Digital_root
class Solution {
    public int addDigits(int num) {
        if(num == 0) {
            return 0;
        }
        else if(num % 9 != 0) {
            return num % 9;
        }
        else {
            return 9;
        }
    }
}
