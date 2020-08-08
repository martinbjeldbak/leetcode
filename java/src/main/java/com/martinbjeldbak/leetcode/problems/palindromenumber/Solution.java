package com.martinbjeldbak.leetcode.problems.palindromenumber;

// https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        char[] v = String.valueOf(x).toCharArray();

        for(int i = 0; i < (v.length / 2); i++) {
            if(v[i] != v[v.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
