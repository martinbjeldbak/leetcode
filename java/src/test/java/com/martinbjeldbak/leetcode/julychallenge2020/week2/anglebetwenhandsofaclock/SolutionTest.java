package com.martinbjeldbak.leetcode.julychallenge2020.week2.anglebetwenhandsofaclock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(165, subject.angleClock(12, 30));
    }

    @Test
    void testExample2() {
        assertEquals(75, subject.angleClock(3, 30));
    }

    @Test
    void testExample3() {
        assertEquals(7.5, subject.angleClock(3, 15));
    }

    @Test
    void testExample4() {
        assertEquals(155, subject.angleClock(4, 50));
    }

    @Test
    void testExample5() {
        assertEquals(0, subject.angleClock(12, 0));
    }
}