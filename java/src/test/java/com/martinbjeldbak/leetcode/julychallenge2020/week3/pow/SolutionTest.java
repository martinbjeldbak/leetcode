package com.martinbjeldbak.leetcode.julychallenge2020.week3.pow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(1024.00000, subject.myPow(2.00000, 10));
    }

    @Test
    void testExample2() {
        assertEquals(9.26100, subject.myPow(2.10000, 3));
    }

    @Test
    void testExample3() {
        assertEquals(0.25000, subject.myPow(2.00000, -2));
    }

    @Test
    void testSlow() {
        assertEquals(Integer.MAX_VALUE, subject.myPow(2, 31) - 1);
    }

    @Test
    void testSlow2() {
        assertEquals(1, subject.myPow(1, 2147483647));
    }

    @Test
    void testExampleRounding() {
        assertEquals(700.28148, subject.myPow(8.88023, 3));
    }

    @Test
    void testNZero() {
        assertEquals(1.00000, subject.myPow(0.44528, 0));
    }

    @Test
    void testNOne() {
        assertEquals(0.44528, subject.myPow(0.44528, 1));
    }

    @Test
    void testZero2() {
        assertEquals(0, subject.myPow(2, -2147483648));
    }

    @Test
    void testEdgecase1() {
        assertEquals(-1, subject.myPow(-1, 2147483647));
    }

    @Test
    void testEdgecase2() {
        assertEquals(1, subject.myPow(-1, -2147483648));
    }

    @Test
    void testEdgecase3() {
        assertEquals(1, subject.myPow(1, -2147483648));
    }
}