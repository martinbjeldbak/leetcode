package com.martinbjeldbak.leetcode.julychallenge2020.week5.climbingstairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // There are two ways to climb to the top.
    // 1. 1 step + 1 step
    // 2. 2 steps
    void testExample1() {
        assertEquals(2, subject.climbStairs(2));
    }

    @Test
    // There are three ways to climb to the top.
    // 1. 1 step + 1 step + 1 step
    // 2. 1 step + 2 steps
    // 3. 2 steps + 1 step
    void testExample2() {
        assertEquals(3, subject.climbStairs(3));
    }

    @Test
    void testMartinExample() {
        assertEquals(1, subject.climbStairs(1));
    }

    @Test
    // 1. 1 step + 1 step + 1 step + 1 step
    // 2. 1 step + 2 steps + 1 step + 1 step
    // 3. 1 step + 1 step + 2 steps
    // 4. 2 steps + 2 steps
    // 5. 2 steps + 1 step + 1 step
    void testMartinExample2() {
        assertEquals(5, subject.climbStairs(4));
    }

    @Test
    void testMartinSlow() {
        assertEquals(1836311903, subject.climbStairs(45));
    }
}