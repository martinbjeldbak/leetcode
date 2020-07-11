package com.martinbjeldbak.leetcode.julychallenge2020.week2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public void addNext(Node nextNode) {
        next = nextNode;
        nextNode.prev = this;
    }

    public void addChild(Node childNode) {
        child = childNode;
    }

    public List<Integer> serialize() {
        Node s = this;
        List<List<Integer>> levels = new ArrayList<>();
        List<Integer> siblings = new ArrayList<>();
        levels.add(siblings);
        siblings.add(s.val);

        int siblingCount = 1;
        while(s.next != null) {
            s = s.next;
            siblings.add(s.val);
            siblingCount++;

            if(s.child != null) {
                List<Integer> indentation = new ArrayList<>(siblingCount);
                for(int i = 0; i < siblingCount; i++) {
                    indentation.add(null);
                }
                indentation.addAll(s.child.serialize());
                levels.add(indentation);
            }
        }

        return levels.stream().flatMap(Collection::stream).collect(Collectors.toList());
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