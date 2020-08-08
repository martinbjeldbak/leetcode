package com.martinbjeldbak.leetcode.augustchallenge2020.week1.findallduplicatesinanarray;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(List.of(2, 3), subject.findDuplicates(new int[]{ 4, 3, 2, 7, 8, 2, 3, 1 }));
    }

    @Test
    void testMartinExample1() {
        assertEquals(List.of(), subject.findDuplicates(new int[]{ }));
    }

    @Test
    void testMartinExample2() {
        assertEquals(List.of(), subject.findDuplicates(new int[]{ 1 }));
    }

    @Test
    void testMartinExample3() {
        assertEquals(List.of(1), subject.findDuplicates(new int[]{ 1, 1 }));
    }
}