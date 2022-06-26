package com.martinbjeldbak.leetcode.augustchallenge2020.week1.detectcaptial;

class Solution {
    public boolean detectCapitalUse(String word) {
        boolean case1 = true, // All letters in this word are capitals, like "USA".
                case2 = true, // All letters in this word are not capitals, like "leetcode".
                case3 = true; // Only the first letter in this word is capital, like "Google".

        for(int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);

            if(currentLetter != Character.toUpperCase(currentLetter)) {
                case1 = false;
            }
            if(currentLetter != Character.toLowerCase(currentLetter)) {
                case2 = false;
            }
            if(i > 0 && currentLetter == Character.toUpperCase(currentLetter)) {
                case3 = false;
            }

        }

        return case1 || case2 || case3;
    }
}
