package com.martinbjeldbak.leetcode.julychallenge2020.week3.topkfrequentelements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertArrayEquals(new int[] { 1, 2 }, subject.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2));
    }

    @Test
    void testExample2() {
        assertArrayEquals(new int[] { 1 }, subject.topKFrequent(new int[] { 1 }, 1));
    }

    @Test
    void testExample3() {
        assertArrayEquals(new int[] { -1, 2 }, subject.topKFrequent(new int[] { 4, 1, -1, 2, -1, 2, 3 }, 2));
    }
}