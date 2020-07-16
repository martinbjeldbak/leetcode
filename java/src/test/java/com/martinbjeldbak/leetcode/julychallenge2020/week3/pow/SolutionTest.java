package com.martinbjeldbak.leetcode.julychallenge2020.week3.pow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(1024.00000, subject.myPow(2.00000, 10));
    }

    @Test
    void testExample2() {
        assertEquals(9.26100, subject.myPow(2.10000, 3));
    }

    @Test
    void testExample3() {
        assertEquals(0.25000, subject.myPow(2.00000, -2));
    }
}