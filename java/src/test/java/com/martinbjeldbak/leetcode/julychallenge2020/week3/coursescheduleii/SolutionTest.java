package com.martinbjeldbak.leetcode.julychallenge2020.week3.coursescheduleii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // There are a total of 2 courses to take. To take course 1 you should have finished
    // course 0. So the correct course order is [0,1] .
    void testExample1() {
        assertArrayEquals(new int [] { 0, 1 }, subject.findOrder(2, new int[][]{ new int[] { 0, 1 } } ));
    }

    @Test
    void testExample2() {
        assertArrayEquals(new int [] { 0, 1, 2, 3 },
                subject.findOrder(4,
                        new int[][]{
                                new int[] { 1, 0 },
                                new int[] { 2, 0 },
                                new int[] { 3, 1 },
                                new int[] { 3, 2 } }
                                )
        );
    }
}