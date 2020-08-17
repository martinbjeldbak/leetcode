package com.martinbjeldbak.leetcode.augustchallenge2020.week3.distributecandies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertArrayEquals(new int[] { 1,2,3,1 }, subject.distributeCandies(7, 4));
    }

    @Test
    void testExample2() {
        assertArrayEquals(new int[] { 5,2,3 }, subject.distributeCandies(10, 3));
    }

    @Test
    void testMartinExample1() {
        assertArrayEquals(new int[] { 1 }, subject.distributeCandies(1, 1));
    }
}