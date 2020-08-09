package com.martinbjeldbak.leetcode.problems.findnumberswithevennumberofdigits;

// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
class Solution {
    public int findNumbers(int[] nums) {
        int numbersWithEvenDigits = 0;

        for(int i = 0; i < nums.length; i++) {
            if(hasEvenDigits(nums[i]))
                numbersWithEvenDigits++;
        }

        return numbersWithEvenDigits;
    }

    private boolean hasEvenDigits(int number) {
        int numDigits = 0;

        while(number > 0) {
            number /= 10;
            numDigits++;
        }
        return (numDigits % 2) == 0;
    }
}
