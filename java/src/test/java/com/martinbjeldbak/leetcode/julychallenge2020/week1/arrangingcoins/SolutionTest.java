package com.martinbjeldbak.leetcode.julychallenge2020.week1.arrangingcoins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(2, subject.arrangeCoins(5));
    }


    @Test
    void testExample2() {
        assertEquals(3, subject.arrangeCoins(8));
    }
}