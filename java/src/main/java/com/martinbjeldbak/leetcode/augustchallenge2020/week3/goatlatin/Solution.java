package com.martinbjeldbak.leetcode.augustchallenge2020.week3.goatlatin;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/551/week-3-august-15th-august-21st/3429/
class Solution {
    public List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

    public String toGoatLatin(String S) {
        if(S.length() == 0)
            return "";

        String[] words = S.split(" ");
        List<String> newSentence = new ArrayList<>(words.length);

        StringBuilder as = new StringBuilder("a");

        for (String word : words) {
            if (!vowels.contains(Character.toLowerCase(word.charAt(0)))) {
                word = word.substring(1) + word.charAt(0);
            }

            word += "ma" + as;
            as.append("a");

            newSentence.add(word);
        }

        return String.join(" ", newSentence);
    }
}
