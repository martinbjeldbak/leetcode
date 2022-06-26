package com.martinbjeldbak.leetcode.augustchallenge2020.week1.findallduplicatesinanarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3414/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>(nums.length);
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);

            if(counts.get(num) > 1) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}