package com.martinbjeldbak.leetcode.julychallenge2020.week2.reversebits;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3388/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sb = new StringBuilder(binary);

        return (int)Long.parseLong(sb.reverse().toString(), 2);
    }
}
