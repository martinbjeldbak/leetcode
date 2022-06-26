package com.martinbjeldbak.leetcode.augustchallenge2020.week2.hindex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had
    //              received 3, 0, 6, 1, 5 citations respectively.
    //              Since the researcher has 3 papers with at least 3 citations each and the remaining
    //              two with no more than 3 citations each, her h-index is 3.
    void testExample1() {
        assertEquals(3, subject.hIndex(new int[] { 3, 0, 6, 1, 5 }));
    }

    @Test
    void testMartinExample1() {
        assertEquals(4, subject.hIndex(new int[] { 8, 5, 10, 3, 4 }));
    }

    @Test
    void testMartinExample2() {
        assertEquals(3, subject.hIndex(new int[] { 3, 5, 3, 8, 25 }));
    }

    @Test
    void testMartinExample3() {
        assertEquals(0, subject.hIndex(new int[] { }));
    }

    @Test
    void testMartinExample4() {
        assertEquals(1, subject.hIndex(new int[] { 1, 1 }));
    }

    @Test
    void testFailed1() {
        assertEquals(1, subject.hIndex(new int[] { 1 }));
    }
}