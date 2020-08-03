package com.martinbjeldbak.leetcode.augustchallenge2020.week1.validpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertTrue(subject.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void testExample2() {
        assertFalse(subject.isPalindrome("race a car"));
    }

    @Test
    void testMartinExample1() {
        assertTrue(subject.isPalindrome("A"));
    }

    @Test
    void testMartinExample2() {
        assertTrue(subject.isPalindrome("Aa"));
    }
}