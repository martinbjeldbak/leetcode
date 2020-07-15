package com.martinbjeldbak.leetcode.julychallenge2020.week3.reversewordsinastring;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3391/
class Solution {
    public String reverseWords(String s) {
        String[] sSplit = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < sSplit.length; i++) {
            sb.append(sSplit[sSplit.length - 1 - i]);

            if(i == sSplit.length - 1)
                continue;

            sb.append(" ");
        }

        return sb.toString();
    }
}
