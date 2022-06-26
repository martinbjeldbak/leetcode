package com.martinbjeldbak.leetcode.problems.maxconsecutiveones;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentStreak = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                currentStreak++;
            } else {
                currentStreak = 0;
            }

            if(currentStreak > maxConsecutiveOnes)
                maxConsecutiveOnes = currentStreak;
        }

        return maxConsecutiveOnes;
    }
}
