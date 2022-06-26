package com.martinbjeldbak.leetcode.julychallenge2020.week1.binarylevelordertraversal2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution subject = new Solution();

    @Test
    // Given this binary tree
    //    3
    //   / \
    //  9  20
    //    /  \
    //   15   7
    // Its bottom up traversal order is
    // [
    //   [15,7],
    //   [9,20],
    //   [3]
    // ]
    void testExample1() {
        TreeNode head = new TreeNode(3,
                new TreeNode(9), new TreeNode(20,
                            new TreeNode(15), new TreeNode(7))
        );

        assertEquals(List.of(List.of(15, 7), List.of(9, 20), List.of(3)),
                     subject.levelOrderBottom(head));
    }

    @Test
    void testExample2() {
        TreeNode head = new TreeNode(3, new TreeNode(9), new TreeNode(20));

        assertEquals(List.of(List.of(9, 20), List.of(3)),
                subject.levelOrderBottom(head));

    }

}