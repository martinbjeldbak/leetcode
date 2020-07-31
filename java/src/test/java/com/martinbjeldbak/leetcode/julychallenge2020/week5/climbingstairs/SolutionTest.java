package com.martinbjeldbak.leetcode.julychallenge2020.week5.climbingstairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(2, subject.climbStairs(2));
    }

    @Test
    void testExample2() {
        assertEquals(3, subject.climbStairs(3));
    }
}