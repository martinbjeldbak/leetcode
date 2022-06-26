package com.martinbjeldbak.leetcode.julychallenge2020.week5.besttimetobuyandsellstock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(3, subject.maxProfit(new int[] { 1, 2, 3, 0, 2 }));
    }

    @Test
    void testMartinExample() {
        assertEquals(1, subject.maxProfit(new int[] { 1, 2 }));
    }

    @Test
    // buy, buy, sell
    void testMartinExample2() {
        assertEquals(10, subject.maxProfit(new int[] { 1, 0, 10 }));
    }

    @Test
        // buy, buy, sell
    void testMartinExample3() {
        assertEquals(3, subject.maxProfit(new int[] { 1, 2, 4 }));
    }
}