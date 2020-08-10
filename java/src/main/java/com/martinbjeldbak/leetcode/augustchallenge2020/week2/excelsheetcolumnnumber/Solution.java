package com.martinbjeldbak.leetcode.augustchallenge2020.week2.excelsheetcolumnnumber;

import java.util.*;

// https://leetcode.com/explore/featured/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3419/
class Solution {
    public int titleToNumber(String s) {
        List<Character> alphabet = new ArrayList<>(List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'));

        int sum = 0;
        int offset;

        for(int i = 0; i < s.length(); i++) {
            if((s.length() - i - 1) == 0)
                offset = alphabet.indexOf(s.charAt(i)) + 1;
            else
                offset = (int)(Math.pow(26, (s.length() - i - 1))) * (alphabet.indexOf(s.charAt(i)) + 1);

            sum += offset;
        }

        return sum;
    }
}
