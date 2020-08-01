package com.martinbjeldbak.leetcode.augustchallenge2020.week1.detectcaptial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertTrue(subject.detectCapitalUse("USA"));
    }

    @Test
    void testExample2() {
        assertFalse(subject.detectCapitalUse("FlaG"));
    }

    @Test
    void testMartinExample1() {
        assertTrue(subject.detectCapitalUse("Google"));
    }

    @Test
    void testMartinExample2() {
        assertTrue(subject.detectCapitalUse("leetcode"));
    }
}