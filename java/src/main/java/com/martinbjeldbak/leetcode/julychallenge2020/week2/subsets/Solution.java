package com.martinbjeldbak.leetcode.julychallenge2020.week2.subsets;

import java.util.*;

// Source: https://leetcode.com/explore/featured/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3387/
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return subsetsMemoized(nums, new HashMap<>());
    }

    public List<List<Integer>> subsetsMemoized(int[] nums, Map<List<Integer>, List<List<Integer>>> memo) {
        List<Integer> numsList = new ArrayList<>();
        for(int n : nums) {
            numsList.add(n);
        }

        Set<List<Integer>> subsets;
        subsets = subsetsOf(numsList);

        Set<List<Integer>> totals = new HashSet<>();

        for(List<Integer> subset : subsets) {
            if(memo.containsKey(subset)) {
                totals.addAll(memo.get(subset));
            }
            else {
                List<List<Integer>> subSubsets = subsetsMemoized(convertListToArray(subset), memo);
                memo.put(subset, subSubsets);
                totals.addAll(subsetsMemoized(convertListToArray(subset), memo));
            }
        }

        totals.addAll(subsets);
        totals.add(numsList);

        return new ArrayList<>(totals);
    }

    public int[] convertListToArray(List<Integer> subset) {
        int[] converted = new int[subset.size()];
        for(int i = 0; i < converted.length; i++) {
            converted[i] = subset.get(i);
        }
        return converted;
    }

    public Set<List<Integer>> subsetsOf(List<Integer> nums) {
        Set<List<Integer>> subSets = new HashSet<>();

        for(int i = 0; i < nums.size(); i++) {
            List<Integer> newSubset = new ArrayList<>();

            newSubset.addAll(nums.subList(0, i));
            newSubset.addAll(nums.subList(i + 1, nums.size()));

            subSets.add(newSubset);
        }
        return subSets;
    }
}