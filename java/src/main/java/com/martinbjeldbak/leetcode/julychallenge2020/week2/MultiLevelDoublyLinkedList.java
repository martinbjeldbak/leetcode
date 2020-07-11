package com.martinbjeldbak.leetcode.julychallenge2020.week2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    @Override
    public int hashCode() {
        System.out.println("YEEHAW");
        return super.hashCode();
    }

    public List<Integer> serialize() {
        List<Integer> self = new ArrayList<>();
        self.add(val);

        if(next != null) {
            self.addAll(next.serialize());
        }
        else {
            self.add(null);
        }

        if(child != null) {
            self.addAll(child.serialize());
        }

        return self;
    }
};

// https://leetcode.com/explore/featured/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3386/
class Solution {
    public Node flatten(Node head) {

        if(head.child != null) {
            Node newHead = new Node();
            newHead.val = head.val;
            newHead.prev = head.prev;
            newHead.next = head.child;
            newHead.next.next = head.next;

            return newHead;

        }
        return head;
    }
}