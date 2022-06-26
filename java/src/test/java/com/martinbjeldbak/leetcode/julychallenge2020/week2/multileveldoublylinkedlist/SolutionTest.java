package com.martinbjeldbak.leetcode.julychallenge2020.week2.multileveldoublylinkedlist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    public void testBase() {
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();

        one.val = 1;
        two.val = 2;
        three.val = 3;

        one.addNext(two);
        one.addChild(three);

        assertEquals(List.of(1, 3, 2), subject.flatten(one).serialize());
    }

    @Test
    public void testNoInput() {
        assertNull(subject.flatten(null));
    }

    @Test
    public void testExampleOne() {
        Node one = new Node();
        one.val = 1;

        Node two = new Node();
        two.val = 2;

        Node three = new Node();
        three.val = 3;

        Node four = new Node();
        four.val = 4;

        Node five = new Node();
        five.val = 5;

        Node six = new Node();
        six.val = 6;

        Node seven = new Node();
        seven.val = 7;

        Node eight = new Node();
        eight.val = 8;

        Node nine = new Node();
        nine.val = 9;

        Node ten = new Node();
        ten.val = 10;

        Node eleven = new Node();
        eleven.val = 11;

        Node twelve = new Node();
        twelve.val = 12;

        one.addNext(two);
        two.addNext(three);
        three.addNext(four);
        four.addNext(five);
        five.addNext(six);

        three.addChild(seven);

        seven.addNext(eight);
        eight.addNext(nine);
        nine.addNext(ten);

        eight.addChild(eleven);
        eleven.addNext(twelve);

        assertEquals(List.of(1, 2, 3, 7, 8, 11 , 12, 9, 10, 4, 5, 6),
                     subject.flatten(one).serialize());
    }

    @Test
    /*
        Node:
        1 - 2
        |
        3 - 4

        Becomes:
        1 3 4 2

     */
    public void testExampleTwo() {
        Node one = new Node();
        one.val = 1;

        Node two = new Node();
        two.val = 2;

        Node three = new Node();
        three.val = 3;

        Node four = new Node();
        four.val = 4;

        one.addNext(two);
        one.addChild(three);
        three.addNext(four);


        assertEquals(List.of(1, 3, 4, 2),
                     subject.flatten(one).serialize());
    }
}