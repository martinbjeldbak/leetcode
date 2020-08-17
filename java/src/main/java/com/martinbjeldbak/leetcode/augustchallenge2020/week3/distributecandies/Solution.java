package com.martinbjeldbak.leetcode.augustchallenge2020.week3.distributecandies;

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] candyDistribtution = new int[num_people];
        int currentHandoutLevel = 1;
        int currentPersonIndex = 0;

        while(candies > 0) {
            candyDistribtution[currentPersonIndex] += Math.min(currentHandoutLevel, candies);

            candies = candies - currentHandoutLevel;
            currentHandoutLevel++;

            currentPersonIndex = currentPersonIndex == (num_people - 1) ? 0 : currentPersonIndex + 1;
        }
        return candyDistribtution;
    }
}