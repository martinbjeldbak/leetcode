package com.martinbjeldbak.leetcode.augustchallenge2020.week3.goatlatin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    void testExample1() {
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", subject.toGoatLatin("I speak Goat Latin"));
    }

    @Test
    void testExample2() {
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", subject.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

    @Test
    void testMartin1() {
        assertEquals("", subject.toGoatLatin(""));
    }

    @Test
    void testMartin2() {
        assertEquals("applemaa", subject.toGoatLatin("apple"));
    }

    @Test
    void testFailed1() {
        assertEquals("Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa",
                subject.toGoatLatin("Each word consists of lowercase and uppercase letters only"));
    }
}