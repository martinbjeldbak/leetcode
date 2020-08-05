package com.martinbjeldbak.leetcode.augustchallenge2020.week1.addandsearchword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {
    WordDictionary subject;

    @Test
    void testExample1() {
        subject = new WordDictionary();
        subject.addWord("bad");
        subject.addWord("dad");
        subject.addWord("mad");
        assertFalse(subject.search("pad"));
        assertTrue(subject.search("bad"));
        assertTrue(subject.search(".ad"));
        assertTrue(subject.search("b.."));
    }

}