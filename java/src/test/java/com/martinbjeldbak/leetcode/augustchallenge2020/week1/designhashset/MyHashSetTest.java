package com.martinbjeldbak.leetcode.augustchallenge2020.week1.designhashset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {
    @Test
    void testExample1() {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        assertTrue(hashSet.contains(1));
        assertFalse(hashSet.contains(3));
        hashSet.add(2);
        assertTrue(hashSet.contains(2));
        hashSet.remove(2);
        assertFalse(hashSet.contains(2));
    }

}