package com.martinbjeldbak.leetcode.julychallenge2020.week3.topkfrequentelements;

import java.util.*;

// https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/546/week-3-july-15th-july-21st/3393/
class Solution {
    // Input: nums = [1,1,1,2,2,3], k = 2
    // Output: [1,2]
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int[][] values = new int[counts.keySet().size()][2];

        int i = 0;
        for(Map.Entry<Integer, Integer> count : counts.entrySet()) {
            values[i] = new int[] { count.getKey(), count.getValue() };
            i++;
        }

        Arrays.sort(values, (v1, v2) -> Integer.compare(v2[1], v1[1]));

        int[] result = new int[k];
        for(i = 0; i < k; i++) {
            result[i] = values[i][0];
        }

        return result;
    }
}