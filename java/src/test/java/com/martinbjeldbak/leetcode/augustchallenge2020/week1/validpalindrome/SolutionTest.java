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

    @Test
    void testMartinExample3() {
        assertTrue(subject.isPalindrome("123321"));
    }

    @Test
    void testMartinExample4() {
        assertTrue(subject.isPalindrome("Aba"));
    }

    @Test
    void testMartinExample5() {
        assertTrue(subject.isPalindrome("Abcba"));
    }

    @Test
    void testMartinExample6() {
        assertFalse(subject.isPalindrome("Abcca"));
    }

    @Test
    void testFailedExample() {
        assertTrue(subject.isPalindrome("ab_a"));
    }
}