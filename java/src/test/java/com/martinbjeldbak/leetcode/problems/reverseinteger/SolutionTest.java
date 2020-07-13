package com.martinbjeldbak.leetcode.problems.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // Input: 123
    // Output: 321
    void testExample1() {
        assertEquals(321, subject.reverse(123));
    }

    @Test
    // Input: -123
    // Output: -321
    void testExample2() {
        assertEquals(-321, subject.reverse(-123));
    }

    @Test
    // Input: 120
    // Output: 21
    void testExample3() {
        assertEquals(21, subject.reverse(120));
    }

    @Test
    void testExampleOverflow() {
        assertEquals(0, subject.reverse(1534236469));
    }

}