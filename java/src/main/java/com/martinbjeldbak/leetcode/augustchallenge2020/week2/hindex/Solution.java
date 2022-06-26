package com.martinbjeldbak.leetcode.augustchallenge2020.week2.hindex;

import java.util.Arrays;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3420/
class Solution {
    public int hIndex(int[] citations) {
        int h = 0;

        Arrays.sort(citations);

        for(int i = citations.length - 1; i >= 0; i--) {
            if(citations[i] > h)
                h++;
        }

        return h;
    }
}
