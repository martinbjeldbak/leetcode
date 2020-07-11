package com.martinbjeldbak.leetcode.julychallenge2020.week2.multileveldoublylinkedlist;

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

        if(s == null) {
            return new ArrayList<>(0);
        }

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
}
