package com.martinbjeldbak.leetcode.julychallenge2020.week4.taskscheduler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    // A -> B -> idle -> A -> B -> idle -> A -> B
    // There is at least 2 units of time between any two same tasks.
    @Test
    void testExample1() {
        assertEquals(8, subject.leastInterval(new char[] { 'A','A','A','B','B','B' }, 2));
    }

    // On this case any permutation of size 6 would work since n = 0.
    // ["A","A","A","B","B","B"]
    // ["A","B","A","B","A","B"]
    // ["B","B","B","A","A","A"]
    // ...
    // And so on.
    @Test
    void testExample2() {
        assertEquals(6, subject.leastInterval(new char[] { 'A','A','A','B','B','B' }, 0));
    }

    // One possible solution is
    // A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle -> A
    @Test
    void testExample3() {
        assertEquals(16, subject.leastInterval(new char[] { 'A','A','A','A','A','A','B','C','D','E','F','G' }, 2));
    }

    @Test
    void testFailed1() {
        assertEquals(104, subject.leastInterval(new char[] { 'A','A','A','B','B','B' }, 50));
    }
}