package com.martinbjeldbak.leetcode.julychallenge2020.week2.subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    Solution subject = new Solution();

    @Test
    public void testCase1() {
        assertEquals(
                List.of(List.of(3), List.of(1), List.of(2), List.of(1, 2, 3), List.of(1, 3),
                        List.of(2, 3), List.of(1, 2), List.of()),
                subject.subsets(new int[] { 1, 2, 3} ));
    }
}
