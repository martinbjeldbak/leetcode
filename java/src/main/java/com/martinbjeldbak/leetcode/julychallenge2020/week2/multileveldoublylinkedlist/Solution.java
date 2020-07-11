package com.martinbjeldbak.leetcode.julychallenge2020.week2.multileveldoublylinkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

;

// https://leetcode.com/explore/featured/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3386/
class Solution {
    public Node flatten(Node head) {
        if(head == null) {
            return null;
        }

        if(head.next != null) {
            head.next = flatten(head.next);
        }

        if(head.child != null) {
            Node last = head.next;
            Node child = flatten(head.child);

            head.next = child;
            head.child = null;
            child.prev = head;

            while(child.next != null) {
                child = child.next;
            }
            child.next = last;
            last.prev = child;
        }

        return head;
    }
}