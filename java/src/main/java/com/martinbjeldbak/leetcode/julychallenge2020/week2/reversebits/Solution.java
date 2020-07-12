package com.martinbjeldbak.leetcode.julychallenge2020.week2.reversebits;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3388/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int answer = 0;

        for(int i = 0; i < 32; i++) {
            answer = answer << 1;
            answer = answer | (n & 1);
            n = n >> 1;
        }
        return answer;
    }
}
