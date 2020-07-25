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
}