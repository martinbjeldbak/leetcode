package com.martinbjeldbak.leetcode.julychallenge2020.week1.arrangingcoins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // n = 1
    // The coins can form the following rows:
    // ¤
    // Because the 1st row is complete, we return 1.
    void testOneCoin() {
        assertEquals(1, subject.arrangeCoins(1));
    }

    @Test
    // n = 2
    //
    //The coins can form the following rows:
    //¤
    //¤
    //
    //B ecause the 2nd row is incomplete, we return 1.
    void testTwoCoins() {
        assertEquals(1, subject.arrangeCoins(2));
    }

    @Test
    // n = 5
    //
    // The coins can form the following rows:
    // ¤
    // ¤ ¤
    // ¤ ¤
    //
    // Because the 3rd row is incomplete, we return 2.
    void testExample1() {
        assertEquals(2, subject.arrangeCoins(5));
    }


    @Test
    // n = 8
    //
    // The coins can form the following rows:
    // ¤
    // ¤ ¤
    // ¤ ¤ ¤
    // ¤ ¤
    //
    // Because the 4th row is incomplete, we return 3.
    void testExample2() {
        assertEquals(3, subject.arrangeCoins(8));
    }

    @Test
    void test9() {
        assertEquals(3, subject.arrangeCoins(9));
    }

    @Test
    // n = 10
    //
    // The coins can form the following rows:
    // ¤
    // ¤ ¤
    // ¤ ¤ ¤
    // ¤ ¤ ¤ ¤
    //
    // Because the 4th row is complete, we return 4.
    void test10() {
        assertEquals(4, subject.arrangeCoins(10));
    }

    @Test
    void testSlow() {
        assertEquals(37943, subject.arrangeCoins(719885386));
    }
}