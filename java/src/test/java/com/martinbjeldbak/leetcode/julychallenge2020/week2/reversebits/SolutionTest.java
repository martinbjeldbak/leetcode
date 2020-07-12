package com.martinbjeldbak.leetcode.julychallenge2020.week2.reversebits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // Input: 00000010100101000001111010011100
    // Output: 00111001011110000010100101000000
    // Explanation: The input binary string 00000010100101000001111010011100 represents the
    // unsigned integer 43261596, so return 964176192 which its binary representation is
    // 00111001011110000010100101000000.
    void testExample1() {
        assertEquals(964176192, subject.reverseBits(43261596));
    }

    @Test
    // Input: 11111111111111111111111111111101
    // Output: 10111111111111111111111111111111
    // Explanation: The input binary string 11111111111111111111111111111101 represents the
    // unsigned integer 4294967293, so return 3221225471 which its binary representation is
    // 10111111111111111111111111111111.
    void testExample2() {
        assertEquals(-1073741825, subject.reverseBits(-3));
    }
}