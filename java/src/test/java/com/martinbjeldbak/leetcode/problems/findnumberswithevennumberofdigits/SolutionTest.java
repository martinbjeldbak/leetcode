package com.martinbjeldbak.leetcode.problems.findnumberswithevennumberofdigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(2, subject.findNumbers(new int[] { 12, 345, 2, 6, 7896 }));
    }

    @Test
    void testExample2() {
        assertEquals(1, subject.findNumbers(new int[] { 555, 901, 482, 1771 }));
    }

    @Test
    void testMartinExample1() {
        assertEquals(1, subject.findNumbers(new int[] { 345, 2, 6, 7896 }));
    }

    @Test
    void testMartinExample2() {
        assertEquals(0, subject.findNumbers(new int[] { 345, 2, 6, 796 }));
    }
}