package com.martinbjeldbak.leetcode.problems.squaresofsortedarray;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            result[i] = A[i] * A[i];
        }

        Arrays.sort(result);
        return result;
    }
}
