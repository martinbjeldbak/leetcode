package com.martinbjeldbak.leetcode.augustchallenge2020.week2.pascalstriangleii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(List.of(1, 3, 3, 1), subject.getRow(3));
    }

    @Test
    void testMartinExample1() {
        assertEquals(List.of(1, 4, 6, 4, 1), subject.getRow(4));
    }
}