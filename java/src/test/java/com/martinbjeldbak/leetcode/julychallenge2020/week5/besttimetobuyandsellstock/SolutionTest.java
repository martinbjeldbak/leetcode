package com.martinbjeldbak.leetcode.julychallenge2020.week5.besttimetobuyandsellstock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(3, subject.maxProfit(new int[] { 1, 2, 3, 0, 2 }));
    }
}