package com.martinbjeldbak.leetcode.problems.reverseinteger;

// https://leetcode.com/problems/reverse-integer/
class Solution {

    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));
        int reversed;

        try {
            reversed = Integer.parseInt(sb.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }


        if(x < 0) {
            reversed = -reversed;
        }

        return reversed;
    }
}