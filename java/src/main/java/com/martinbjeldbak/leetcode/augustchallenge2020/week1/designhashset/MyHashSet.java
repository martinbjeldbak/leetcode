package com.martinbjeldbak.leetcode.augustchallenge2020.week1.designhashset;

// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3410
class MyHashSet {
    boolean[] bucket = new boolean[1000000];

    /** Initialize your data structure here. */
    public MyHashSet() {
    }

    public void add(int key) {
        bucket[key] = true;
    }

    public void remove(int key) {
        bucket[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return bucket[key];
    }
}
