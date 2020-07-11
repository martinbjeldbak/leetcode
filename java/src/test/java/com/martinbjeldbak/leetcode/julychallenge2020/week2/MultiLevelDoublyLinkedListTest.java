package com.martinbjeldbak.leetcode.julychallenge2020.week2;

//import com.martinbjeldbak.leetcode.julychallenge2020.week2.MultiLevelDoublyLinkedList
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiLevelDoublyLinkedListTest {
    @Test
    public void test1() {
        Solution subject = new Solution();

        Node one = new Node();
        Node two = new Node();
        Node three = new Node();

        one.val = 1;
        two.val = 2;
        three.val = 3;

        one.next = two;
        two.prev = one;
        one.child = three;

        Node flattenedOne = new Node();
        Node flattenedTwo = new Node();
        Node flattenedThree = new Node();

        flattenedOne.val = 1;
        flattenedTwo.val = 2;
        flattenedThree.val = 3;
        flattenedOne.next = flattenedThree;
        flattenedThree.next = flattenedTwo;
        flattenedThree.prev = flattenedOne;
        flattenedTwo.prev = flattenedThree;

        assertEquals(flattenedOne.serialize(), subject.flatten(one).serialize());
    }
}