package com.martinbjeldbak.leetcode.problems.maxconsecutiveones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(3, subject.findMaxConsecutiveOnes(new int[] { 1,1,0,1,1,1 }));
    }

    @Test
    void testMartinExample1() {
        assertEquals(1, subject.findMaxConsecutiveOnes(new int[] { 1 }));
    }

    @Test
    void testMartinExample2() {
        assertEquals(0, subject.findMaxConsecutiveOnes(new int[] { }));
    }

    @Test
    void testMartinExample3() {
        assertEquals(0, subject.findMaxConsecutiveOnes(new int[] { 2 }));
    }

    @Test
    void testMartinExample4() {
        assertEquals(2, subject.findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1 }));
    }
}