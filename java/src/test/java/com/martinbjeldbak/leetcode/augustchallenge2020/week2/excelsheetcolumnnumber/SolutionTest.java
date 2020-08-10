package com.martinbjeldbak.leetcode.augustchallenge2020.week2.excelsheetcolumnnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals(1, subject.titleToNumber("A"));
    }

    @Test
    void testExample2() {
        assertEquals(28, subject.titleToNumber("AB"));
    }

    @Test
    void testExample3() {
        assertEquals(701, subject.titleToNumber("ZY"));
    }

    @Test
    void testExample4() {
        assertEquals(Integer.MAX_VALUE, subject.titleToNumber("FXSHRXW"));
    }

    @Test
    void testFailed1() {
        assertEquals(703, subject.titleToNumber("AAA"));
    }

    @Test
    void testMartinExample1() {
        assertEquals(44, subject.titleToNumber("AR"));
    }

    @Test
    void testMartinExample2() {
        assertEquals(79, subject.titleToNumber("CA"));
    }

    @Test
    void testMartinExample3() {
        assertEquals(52, subject.titleToNumber("AZ"));
    }

    @Test
    void testMartinExample4() {
        assertEquals(53, subject.titleToNumber("BA"));
    }

    @Test
    void testMartinExample5() {
        assertEquals(18278, subject.titleToNumber("ZZZ"));
    }
}