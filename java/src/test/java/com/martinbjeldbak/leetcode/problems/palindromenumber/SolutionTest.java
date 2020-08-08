package com.martinbjeldbak.leetcode.problems.palindromenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertTrue(subject.isPalindrome(121));
    }

    @Test
    void testExample2() {
        assertFalse(subject.isPalindrome(-121));
    }

    @Test
    void testExample3() {
        assertFalse(subject.isPalindrome(10));
    }
}