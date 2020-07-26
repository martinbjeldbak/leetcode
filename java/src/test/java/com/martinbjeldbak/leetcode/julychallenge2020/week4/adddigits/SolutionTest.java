package com.martinbjeldbak.leetcode.julychallenge2020.week4.adddigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
    //              Since 2 has only one digit, return it
    void testExample1() {
        assertEquals(2, subject.addDigits(38));
    }

    @Test
    // Explanation: The process is like: 3 + 8 + 100 = 111, 1 + 1 + 1 = 3;
    //              Since 2 has only one digit, return it
    void testMartinExample1() {
        assertEquals(3, subject.addDigits(38100));
    }

    @Test
    void testMartinExample2() {
        assertEquals(0, subject.addDigits(0));
    }

    @Test
    void testFailed1() {
        assertEquals(1, subject.addDigits(10));
    }
}