package com.martinbjeldbak.leetcode.augustchallenge2020.week1.validpalindrome;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3411/
class Solution {
    public boolean isPalindrome(String s) {
        String loweredS = s.toLowerCase().replaceAll("\\W", "");
        int sLength = loweredS.length();

        for(int i = 0; i < sLength / 2; i++) {
            if(loweredS.charAt(i) != loweredS.charAt(sLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
