package com.martinbjeldbak.leetcode.augustchallenge2020.week1.poweroffour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertTrue(subject.isPowerOfFour(16));
    }

    @Test
    void testExample2() {
        assertFalse(subject.isPowerOfFour(5));
    }
}