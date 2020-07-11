package com.martinbjeldbak.leetcode.julychallenge2020.week2.subsets;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    Solution subject = new Solution();

    @Test
    public void testCase1() {
        List<List<Integer>> expected = List.of(List.of(3), List.of(1), List.of(2), List.of(1, 2, 3), List.of(1, 3),
                List.of(2, 3), List.of(1, 2), List.of());
        assertTrue(expected.containsAll(subject.subsets(new int[] { 1, 2, 3} )));
    }

    @Test
    public void testCaseSlow() {
        assertEquals(List.of(2, 3), subject.subsets(new int[] {1,2,3,4,5,6,7,8,10,0}));
    }

    @Test
    public void testCaseNone() {
        assertEquals(List.of(List.of()), subject.subsets(new int[] {}));
    }
}
