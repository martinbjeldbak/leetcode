package com.martinbjeldbak.leetcode.problems.squaresofsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertArrayEquals(new int[] { 0,1,9,16,100 }, subject.sortedSquares(new int[] { -4,-1,0,3,10 }));
    }

    @Test
    void testExample2() {
        assertArrayEquals(new int[] { 4,9,9,49,121 }, subject.sortedSquares(new int[] { -7,-3,2,3,11 }));
    }

}