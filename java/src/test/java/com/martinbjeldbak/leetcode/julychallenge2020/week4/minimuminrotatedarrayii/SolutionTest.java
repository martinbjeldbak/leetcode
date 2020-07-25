package com.martinbjeldbak.leetcode.julychallenge2020.week4.minimuminrotatedarrayii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(1, subject.findMin(new int[] {1, 3, 5}));
    }

    @Test
    void testExample2() {
        assertEquals(0, subject.findMin(new int[] {2, 2, 2, 0, 1}));
    }

    @Test
    void testMartinExample1() {
        assertEquals(0, subject.findMin(new int[] { 5, 6, 0, 1, 3 }));
    }

    @Test
    void testMartinExample2() {
        assertEquals(0, subject.findMin(new int[] { 3, 4, 5, 0, 1 }));
    }

    @Test
    void testMartinExample3() {
        assertEquals(1, subject.findMin(new int[] { 1, 1, 1, 1, 1, 1, 1 }));
    }

    @Test
    void testCase1() {
        assertEquals(0, subject.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
    }

    @Test
    void testCase2() {
        assertEquals(0, subject.findMin(new int[] { 7, 0, 1, 2 }));
    }
}