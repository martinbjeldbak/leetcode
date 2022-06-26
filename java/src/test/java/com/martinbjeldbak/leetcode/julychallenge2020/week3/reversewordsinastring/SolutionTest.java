package com.martinbjeldbak.leetcode.julychallenge2020.week3.reversewordsinastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals("blue is sky the", subject.reverseWords("the sky is blue"));
    }

    @Test
    // Explanation: Your reversed string should not contain leading or trailing spaces.
    void testExample2() {
        assertEquals("world! hello", subject.reverseWords("  hello world!  "));
    }

    @Test
    // Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
    void testExample3() {
        assertEquals("example good a", subject.reverseWords("a good   example"));
    }
}