package com.martinbjeldbak.leetcode.julychallenge2020.week2;

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Node n = (Node)obj;

        // System.out.println("Comparing " + val + " to " + n.val);
        return val == n.val && prev == n.prev && child == n.child;
    }
};

// https://leetcode.com/explore/featured/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3386/
class Solution {
    public Node flatten(Node head) {
        return new Node();
    }
}