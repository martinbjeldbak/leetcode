package com.martinbjeldbak.leetcode.julychallenge2020.week5.wordbreakii;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(List.of("cats and dog", "cat sand dog"), subject.wordBreak("catsanddog", List.of("cat", "cats", "and", "sand", "dog")));
    }

    @Test
    void testExample2() {
        assertEquals(List.of("pine apple pen apple", "pineapple pen apple", "pine applepen apple"), subject.wordBreak("pineapplepenapple", List.of("apple", "pen", "applepen", "pine", "pineapple")));
    }

    @Test
    void testExample3() {
        assertEquals(List.of(), subject.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }
}